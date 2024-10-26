package com.gvapps.cryptotracker.crypto.presentation.models

import android.icu.text.NumberFormat
import androidx.annotation.DrawableRes
import com.gvapps.cryptotracker.core.presentation.util.getDrawableIdForCoin
import com.gvapps.cryptotracker.crypto.domain.Coin
import java.util.Locale


data class CoinUi(
	val id: String,
	val rank: Int,
	val symbol: String,
	val name: String,
	val marketCapUsd: DisplayableNumber,
	val priceUsd: DisplayableNumber,
	val changePercent24Hr: DisplayableNumber,
	@DrawableRes val iconRes: Int
)

data class DisplayableNumber(
	val value: Double,
	val formatted: String
)


fun Coin.toCoinUi(): CoinUi {
	return CoinUi(
		id = id,
		rank = rank,
		symbol = symbol,
		name = name,
		marketCapUsd = marketCapUsd.toDisplayableNumber(),
		priceUsd = priceUsd.toDisplayableNumber(),
		changePercent24Hr = changePercent24Hr.toDisplayableNumber(),
		iconRes = getDrawableIdForCoin(symbol),
	)
}

fun Double.toDisplayableNumber(): DisplayableNumber {
	val formatter = NumberFormat.getNumberInstance(Locale.getDefault()).apply {
		minimumIntegerDigits = 1
		maximumFractionDigits = 2
	}
	return DisplayableNumber(
		value = this,
		formatted = formatter.format(this)
	)
}
