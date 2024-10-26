package com.gvapps.cryptotracker.crypto.domain

import com.gvapps.cryptotracker.crypto.data.networking.dto.CoinDto

fun CoinDto.toCoin(): Coin {
	return Coin(
		id = id,
		rank = rank,
		symbol = symbol,
		name = name,
		marketCapUsd = marketCapUsd,
		priceUsd = priceUsd,
		changePercent24Hr = changePercent24Hr
	)

}