package com.gvapps.cryptotracker.crypto.data.networking

import com.gvapps.cryptotracker.core.data.networking.constructUrl
import com.gvapps.cryptotracker.core.data.networking.safeCall
import com.gvapps.cryptotracker.core.domain.util.NetworkError
import com.gvapps.cryptotracker.core.domain.util.Result
import com.gvapps.cryptotracker.core.domain.util.map
import com.gvapps.cryptotracker.crypto.data.networking.dto.CoinResponseDto
import com.gvapps.cryptotracker.crypto.domain.Coin
import com.gvapps.cryptotracker.crypto.domain.CoinDataSource
import com.gvapps.cryptotracker.crypto.domain.toCoin
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
	private val httpClient: HttpClient
) : CoinDataSource {

	override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
		return safeCall<CoinResponseDto> {
			httpClient.get(
				urlString = constructUrl("assets")
			)
		}.map { response ->
			response.data.map {
				it.toCoin()
			}
		}
	}

}