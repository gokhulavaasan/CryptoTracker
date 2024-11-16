package com.gvapps.cryptotracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.gvapps.cryptotracker.core.data.networking.navigation.AdaptiveCoinListDetailPane
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			CryptoTrackerTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					AdaptiveCoinListDetailPane(
						modifier = Modifier.padding(innerPadding)
					)
				}
			}
		}
	}
}