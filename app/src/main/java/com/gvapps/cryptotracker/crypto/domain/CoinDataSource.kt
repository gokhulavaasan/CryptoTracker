package com.gvapps.cryptotracker.crypto.domain


import com.gvapps.cryptotracker.core.domain.util.NetworkError
import com.gvapps.cryptotracker.core.domain.util.Result

interface CoinDataSource {
	suspend fun getCoins(): Result<List<Coin>, NetworkError>
}