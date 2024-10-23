package com.gvapps.cryptotracker.crypto.presentation.coin_list.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gvapps.cryptotracker.crypto.domain.Coin
import com.gvapps.cryptotracker.crypto.presentation.models.CoinUi
import com.gvapps.cryptotracker.crypto.presentation.models.toCoinUi
import com.gvapps.cryptotracker.ui.theme.greenBackground
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinListItem(
    coinUi: CoinUi,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(coinUi.iconRes),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(65.dp)
        )
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = coinUi.symbol,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = SemiBold
                ),
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = coinUi.name,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = Light
                ),
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Text(
                "$ ${coinUi.priceUsd.formatted}",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = SemiBold
                ),
            )
            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .clip(RoundedCornerShape(13.dp))
                    .background(
                        if (coinUi.changePercent24Hr.value > 0) greenBackground
                        else MaterialTheme.colorScheme.errorContainer
                    ),
                horizontalArrangement = Arrangement.End
            ) {
                if (coinUi.changePercent24Hr.value > 0) {
                    Icon(imageVector = Icons.Default.KeyboardArrowUp, contentDescription = null)
                    Text(
                        text = "${coinUi.changePercent24Hr.formatted}% "
                    )
                } else {
                    Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
                    Text(
                        text = "${coinUi.changePercent24Hr.formatted}% "
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CoinListItemPreview() {
    CryptoTrackerTheme {
        CoinListItem(
            coinUi = previewCoin,
            onClick = { },
            modifier = Modifier.background(MaterialTheme.colorScheme.background)
        )
    }
}

internal val previewCoin = Coin(
    id = "bitcoin",
    rank = 1,
    symbol = "BTC",
    name = "Bitcoin",
    marketCapUsd = 119150835874.4699281625807300,
    priceUsd = 6929.8217756835584756,
    changePercent24Hr = -10.8101417214350335
//    changePercent24Hr = 20.8101417214350335
).toCoinUi()