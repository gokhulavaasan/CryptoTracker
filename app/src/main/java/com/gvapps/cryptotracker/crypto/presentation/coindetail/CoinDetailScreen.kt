package com.gvapps.cryptotracker.crypto.presentation.coindetail

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gvapps.cryptotracker.R
import com.gvapps.cryptotracker.crypto.presentation.coin_list.CoinListState
import com.gvapps.cryptotracker.crypto.presentation.coin_list.components.previewCoin
import com.gvapps.cryptotracker.crypto.presentation.coindetail.components.InfoCard
import com.gvapps.cryptotracker.ui.theme.greenBackground
import com.plcoding.cryptotracker.crypto.presentation.coin_detail.LineChart
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CoinDetailScreen(
	state: CoinListState,
	modifier: Modifier = Modifier
) {
	val contentColor =
		if (isSystemInDarkTheme()) {
			Color.White
		} else {
			Color.Black
		}

	if (state.isLoading) {
		Box(
			modifier = Modifier
//				.statusBarsPadding()
				.background(MaterialTheme.colorScheme.background)
				.fillMaxSize(),
			contentAlignment = Alignment.Center
		) {
			CircularProgressIndicator()
		}
	} else if (state.selectedCoin != null) {
		val coin = state.selectedCoin
		Column(
			modifier = modifier
				.padding(16.dp)
				.fillMaxSize()
				.verticalScroll(rememberScrollState()),
			horizontalAlignment = Alignment.CenterHorizontally
		) {
			Icon(
				imageVector = ImageVector.vectorResource(coin.iconRes),
				contentDescription = coin.name,
				tint = MaterialTheme.colorScheme.primary,
				modifier = Modifier.size(100.dp)
			)
			Text(
				text = coin.name,
				fontWeight = FontWeight.Black,
				fontSize = 40.sp,
				textAlign = TextAlign.Center
			)
			Text(
				text = coin.symbol,
				fontWeight = FontWeight.Light,
				fontSize = 20.sp,
				textAlign = TextAlign.Center
			)
			FlowRow(
				modifier = Modifier.fillMaxWidth(),
				horizontalArrangement = Arrangement.Center
			) {
				InfoCard(
					title = stringResource(id = R.string.market_cap),
					formattedText = "$ ${coin.marketCapUsd.formatted}",
					icon = ImageVector.vectorResource(R.drawable.stock)
				)
				InfoCard(
					title = stringResource(id = R.string.price),
					formattedText = "$ ${coin.priceUsd.formatted}",
					icon = ImageVector.vectorResource(R.drawable.dollar)
				)
				val isPositive = coin.changePercent24Hr.value > 0.0
				val contentColor = if (isPositive) {
					if (isSystemInDarkTheme()) Color.Green else greenBackground
				} else {
					MaterialTheme.colorScheme.error
				}
				InfoCard(
					title = stringResource(id = R.string.change_last_24h),
					formattedText = "$ ${coin.changePercent24Hr.formatted}",
					icon = if (coin.changePercent24Hr.value > 0) ImageVector.vectorResource(R.drawable.trending) else ImageVector.vectorResource(
						R.drawable.trending_down
					),
					contentColor = contentColor
				)
			}
			AnimatedVisibility(
				visible = coin.coinPriceHistory.isNotEmpty()
			) {
				var selectedDataPoint by remember {
					mutableStateOf<DataPoint?>(null)
				}
				var labelWidth by remember {
					mutableFloatStateOf(0f)
				}
				var totalChartWidth by remember {
					mutableFloatStateOf(0f)
				}
				val amountOfVisibleDataPoints = if (labelWidth > 0) {
					((totalChartWidth - 2.5 * labelWidth) / labelWidth).toInt()
				} else {
					0
				}
				val startIndex = (coin.coinPriceHistory.lastIndex - amountOfVisibleDataPoints)
					.coerceAtLeast(0)
				LineChart(
					dataPoints = coin.coinPriceHistory,
					style = ChartStyle(
						chartLineColor = MaterialTheme.colorScheme.primary,
						unselectedColor = MaterialTheme.colorScheme.secondary.copy(
							alpha = 0.3f
						),
						selectedColor = MaterialTheme.colorScheme.primary,
						helperLinesThicknessPx = 5f,
						axisLinesThicknessPx = 5f,
						labelFontSize = 14.sp,
						minYLabelSpacing = 25.dp,
						verticalPadding = 8.dp,
						horizontalPadding = 8.dp,
						xAxisLabelSpacing = 8.dp
					),
					visibleDataPointsIndices = startIndex..coin.coinPriceHistory.lastIndex,
					unit = "$",
					modifier = Modifier
						.fillMaxWidth()
						.aspectRatio(16 / 9f)
						.onSizeChanged { totalChartWidth = it.width.toFloat() },
					selectedDataPoint = selectedDataPoint,
					onSelectedDataPoint = {
						selectedDataPoint = it
					},
					onXLabelWidthChange = { labelWidth = it }
				)
			}
		}
	}
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO, showSystemUi = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES, showSystemUi = true)
@Composable
private fun CoinDetailScreenPreview() {
	CryptoTrackerTheme {
		CoinDetailScreen(
			state = CoinListState(
				selectedCoin = previewCoin
			)
		)
	}
}