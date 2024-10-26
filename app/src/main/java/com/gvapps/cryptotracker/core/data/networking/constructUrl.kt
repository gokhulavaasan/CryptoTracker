package com.gvapps.cryptotracker.core.data.networking

import com.gvapps.cryptotracker.BuildConfig.BASE_URL

fun constructUrl(url: String): String {
	return when {
		url.contains(BASE_URL) -> url
		url.startsWith("/") -> BASE_URL + url.drop(1)
		else -> BASE_URL + url
	}
}