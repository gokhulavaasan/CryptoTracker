package com.gvapps.cryptotracker.crypto.presentation.coindetail.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gvapps.cryptotracker.R
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme


@Composable
fun InfoCard(
	title: String,
	formattedText: String,
	icon: ImageVector,
	modifier: Modifier = Modifier,
	contentColor: Color = MaterialTheme.colorScheme.onSurface,
) {
	val defaultTextStyle = LocalTextStyle.current.copy(
		textAlign = TextAlign.Center,
		fontSize = 18.sp,
		color = contentColor
	)
	Card(
		modifier = modifier
			.padding(8.dp)
			.shadow(
				elevation = 15.dp,
				shape = RectangleShape,
				spotColor = MaterialTheme.colorScheme.primary,
				ambientColor = MaterialTheme.colorScheme.primary
			),
		shape = RectangleShape,
		border = BorderStroke(
			width = 1.dp,
			color = MaterialTheme.colorScheme.primary
		),
		colors = CardDefaults.cardColors(
			containerColor = MaterialTheme.colorScheme.surfaceContainer,
			contentColor = contentColor
		)
	) {
		AnimatedContent(
			targetState = icon,
			modifier = Modifier.align(Alignment.CenterHorizontally),
			label = "Icon Animation"
		) {
			Icon(
				imageVector = it,
				contentDescription = null,
				modifier = Modifier
					.size(75.dp)
					.padding(top = 16.dp),
				tint = contentColor
			)
		}
		Spacer(modifier = Modifier.height(8.dp))
		AnimatedContent(
			targetState = formattedText,
			modifier = Modifier.align(Alignment.CenterHorizontally),
			label = "value animation"
		) {
			Text(
				text = it,
				style = defaultTextStyle,
				modifier = Modifier.padding(horizontal = 16.dp)
			)
		}
		Spacer(modifier = Modifier.height(8.dp))
		Text(
			text = title,
			textAlign = TextAlign.Center,
			style = defaultTextStyle,
			modifier = Modifier
				.padding(horizontal = 16.dp)
				.padding(bottom = 16.dp)
				.align(Alignment.CenterHorizontally),
			fontSize = 12.sp,
			fontWeight = FontWeight.Light,

			)
	}
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun InfoCardPreview() {
	CryptoTrackerTheme {
		InfoCard(
			title = "Pricehihoobviuohonh ufuc",
			formattedText = "$ 63,157.44",
			icon = ImageVector.vectorResource(id = R.drawable.dollar)
		)
	}
}
