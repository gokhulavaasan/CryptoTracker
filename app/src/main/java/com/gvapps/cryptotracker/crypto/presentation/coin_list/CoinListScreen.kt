package com.gvapps.cryptotracker.crypto.presentation.coin_list

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gvapps.cryptotracker.crypto.domain.Coin
import com.gvapps.cryptotracker.crypto.presentation.coin_list.components.CoinListItem
import com.gvapps.cryptotracker.crypto.presentation.coin_list.components.previewCoin
import com.gvapps.cryptotracker.crypto.presentation.models.CoinUi
import com.gvapps.cryptotracker.crypto.presentation.models.toCoinUi
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinListScreen(
	state: CoinListState,
	modifier: Modifier = Modifier
) {
	if (state.isLoading) {
		Box(
			modifier = modifier
				.fillMaxSize(),
			contentAlignment = Alignment.Center
		) {
			CircularProgressIndicator()
		}
	} else {
		LazyColumn(
			modifier = modifier
				.fillMaxSize()
				.background(MaterialTheme.colorScheme.background),
			verticalArrangement = Arrangement.spacedBy(16.dp)
		) {
			items(state.coins) { coin ->
				CoinListItem(
					coinUi = coin,
					onClick = {},
					modifier = Modifier.fillMaxWidth()
				)
				HorizontalDivider()
			}
		}
	}
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CoinListScreenPreview() {
	CryptoTrackerTheme {
		CoinListScreen(
			state = CoinListState(
				coins = (1..100).map {
					previewCoin.copy(id = it.toString())
				}
			)
		)
	}
}

internal val listOfCoin: List<CoinUi> = listOf(
	Coin(
		id = "bitcoin",
		rank = 1,
		symbol = "BTC",
		name = "Bitcoin",
		marketCapUsd = 119150835874.4699281625807300,
		priceUsd = 6929.8217756835584756,
		changePercent24Hr = -10.8101417214350335
	).toCoinUi(),
	Coin(
		id = "ethereum",
		rank = 2,
		symbol = "ETH",
		name = "Ethereum",
		marketCapUsd = 40967739219.6612727047843840,
		priceUsd = 404.9774667045200896,
		changePercent24Hr = -0.0999626159535347
	).toCoinUi()
)
