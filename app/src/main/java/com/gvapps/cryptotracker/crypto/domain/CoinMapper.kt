package com.gvapps.cryptotracker.crypto.domain

import com.gvapps.cryptotracker.crypto.data.networking.dto.CoinDto
import com.gvapps.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import java.time.Instant
import java.time.ZoneId

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

fun CoinPriceDto.toCoinPrice(): CoinPrice {
	return CoinPrice(
		priceUsd = priceUsd,
		dateTime = Instant
			.ofEpochMilli(time)
			.atZone(ZoneId.systemDefault())
	)
}