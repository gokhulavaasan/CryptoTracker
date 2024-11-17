package com.gvapps.cryptotracker.crypto.presentation.coin_list

import com.gvapps.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
	data class Error(val error: NetworkError) : CoinListEvent
}