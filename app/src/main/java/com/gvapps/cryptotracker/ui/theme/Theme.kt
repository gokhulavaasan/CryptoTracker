package com.plcoding.cryptotracker.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.gvapps.cryptotracker.ui.theme.Typography
import com.gvapps.cryptotracker.ui.theme.backgroundDark
import com.gvapps.cryptotracker.ui.theme.backgroundDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.backgroundDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.backgroundLight
import com.gvapps.cryptotracker.ui.theme.backgroundLightHighContrast
import com.gvapps.cryptotracker.ui.theme.backgroundLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.errorContainerDark
import com.gvapps.cryptotracker.ui.theme.errorContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.errorContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.errorContainerLight
import com.gvapps.cryptotracker.ui.theme.errorContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.errorContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.errorDark
import com.gvapps.cryptotracker.ui.theme.errorDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.errorDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.errorLight
import com.gvapps.cryptotracker.ui.theme.errorLightHighContrast
import com.gvapps.cryptotracker.ui.theme.errorLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.inverseOnSurfaceDark
import com.gvapps.cryptotracker.ui.theme.inverseOnSurfaceDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.inverseOnSurfaceLight
import com.gvapps.cryptotracker.ui.theme.inverseOnSurfaceLightHighContrast
import com.gvapps.cryptotracker.ui.theme.inverseOnSurfaceLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.inversePrimaryDark
import com.gvapps.cryptotracker.ui.theme.inversePrimaryDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.inversePrimaryDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.inversePrimaryLight
import com.gvapps.cryptotracker.ui.theme.inversePrimaryLightHighContrast
import com.gvapps.cryptotracker.ui.theme.inversePrimaryLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.inverseSurfaceDark
import com.gvapps.cryptotracker.ui.theme.inverseSurfaceDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.inverseSurfaceDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.inverseSurfaceLight
import com.gvapps.cryptotracker.ui.theme.inverseSurfaceLightHighContrast
import com.gvapps.cryptotracker.ui.theme.inverseSurfaceLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onBackgroundDark
import com.gvapps.cryptotracker.ui.theme.onBackgroundDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onBackgroundDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onBackgroundLight
import com.gvapps.cryptotracker.ui.theme.onBackgroundLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onBackgroundLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onErrorContainerDark
import com.gvapps.cryptotracker.ui.theme.onErrorContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onErrorContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onErrorContainerLight
import com.gvapps.cryptotracker.ui.theme.onErrorContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onErrorContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onErrorDark
import com.gvapps.cryptotracker.ui.theme.onErrorDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onErrorDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onErrorLight
import com.gvapps.cryptotracker.ui.theme.onErrorLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onErrorLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryContainerDark
import com.gvapps.cryptotracker.ui.theme.onPrimaryContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryContainerLight
import com.gvapps.cryptotracker.ui.theme.onPrimaryContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryDark
import com.gvapps.cryptotracker.ui.theme.onPrimaryDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryLight
import com.gvapps.cryptotracker.ui.theme.onPrimaryLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onPrimaryLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryContainerDark
import com.gvapps.cryptotracker.ui.theme.onSecondaryContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryContainerLight
import com.gvapps.cryptotracker.ui.theme.onSecondaryContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryDark
import com.gvapps.cryptotracker.ui.theme.onSecondaryDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryLight
import com.gvapps.cryptotracker.ui.theme.onSecondaryLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onSecondaryLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceDark
import com.gvapps.cryptotracker.ui.theme.onSurfaceDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceLight
import com.gvapps.cryptotracker.ui.theme.onSurfaceLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceVariantDark
import com.gvapps.cryptotracker.ui.theme.onSurfaceVariantDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceVariantDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceVariantLight
import com.gvapps.cryptotracker.ui.theme.onSurfaceVariantLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onSurfaceVariantLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryContainerDark
import com.gvapps.cryptotracker.ui.theme.onTertiaryContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryContainerLight
import com.gvapps.cryptotracker.ui.theme.onTertiaryContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryDark
import com.gvapps.cryptotracker.ui.theme.onTertiaryDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryLight
import com.gvapps.cryptotracker.ui.theme.onTertiaryLightHighContrast
import com.gvapps.cryptotracker.ui.theme.onTertiaryLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.outlineDark
import com.gvapps.cryptotracker.ui.theme.outlineDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.outlineDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.outlineLight
import com.gvapps.cryptotracker.ui.theme.outlineLightHighContrast
import com.gvapps.cryptotracker.ui.theme.outlineLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.outlineVariantDark
import com.gvapps.cryptotracker.ui.theme.outlineVariantDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.outlineVariantDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.outlineVariantLight
import com.gvapps.cryptotracker.ui.theme.outlineVariantLightHighContrast
import com.gvapps.cryptotracker.ui.theme.outlineVariantLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.primaryContainerDark
import com.gvapps.cryptotracker.ui.theme.primaryContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.primaryContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.primaryContainerLight
import com.gvapps.cryptotracker.ui.theme.primaryContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.primaryContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.primaryDark
import com.gvapps.cryptotracker.ui.theme.primaryDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.primaryDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.primaryLight
import com.gvapps.cryptotracker.ui.theme.primaryLightHighContrast
import com.gvapps.cryptotracker.ui.theme.primaryLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.scrimDark
import com.gvapps.cryptotracker.ui.theme.scrimDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.scrimDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.scrimLight
import com.gvapps.cryptotracker.ui.theme.scrimLightHighContrast
import com.gvapps.cryptotracker.ui.theme.scrimLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.secondaryContainerDark
import com.gvapps.cryptotracker.ui.theme.secondaryContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.secondaryContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.secondaryContainerLight
import com.gvapps.cryptotracker.ui.theme.secondaryContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.secondaryContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.secondaryDark
import com.gvapps.cryptotracker.ui.theme.secondaryDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.secondaryDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.secondaryLight
import com.gvapps.cryptotracker.ui.theme.secondaryLightHighContrast
import com.gvapps.cryptotracker.ui.theme.secondaryLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceBrightDark
import com.gvapps.cryptotracker.ui.theme.surfaceBrightDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceBrightDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceBrightLight
import com.gvapps.cryptotracker.ui.theme.surfaceBrightLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceBrightLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerDark
import com.gvapps.cryptotracker.ui.theme.surfaceContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighDark
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighLight
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighestDark
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighestDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighestLight
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighestLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerHighestLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLight
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowDark
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowLight
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowestDark
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowestDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowestLight
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowestLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceContainerLowestLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceDark
import com.gvapps.cryptotracker.ui.theme.surfaceDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceDimDark
import com.gvapps.cryptotracker.ui.theme.surfaceDimDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceDimDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceDimLight
import com.gvapps.cryptotracker.ui.theme.surfaceDimLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceDimLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceLight
import com.gvapps.cryptotracker.ui.theme.surfaceLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceVariantDark
import com.gvapps.cryptotracker.ui.theme.surfaceVariantDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceVariantDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.surfaceVariantLight
import com.gvapps.cryptotracker.ui.theme.surfaceVariantLightHighContrast
import com.gvapps.cryptotracker.ui.theme.surfaceVariantLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryContainerDark
import com.gvapps.cryptotracker.ui.theme.tertiaryContainerDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryContainerDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryContainerLight
import com.gvapps.cryptotracker.ui.theme.tertiaryContainerLightHighContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryContainerLightMediumContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryDark
import com.gvapps.cryptotracker.ui.theme.tertiaryDarkHighContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryDarkMediumContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryLight
import com.gvapps.cryptotracker.ui.theme.tertiaryLightHighContrast
import com.gvapps.cryptotracker.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
	primary = primaryLight,
	onPrimary = onPrimaryLight,
	primaryContainer = primaryContainerLight,
	onPrimaryContainer = onPrimaryContainerLight,
	secondary = secondaryLight,
	onSecondary = onSecondaryLight,
	secondaryContainer = secondaryContainerLight,
	onSecondaryContainer = onSecondaryContainerLight,
	tertiary = tertiaryLight,
	onTertiary = onTertiaryLight,
	tertiaryContainer = tertiaryContainerLight,
	onTertiaryContainer = onTertiaryContainerLight,
	error = errorLight,
	onError = onErrorLight,
	errorContainer = errorContainerLight,
	onErrorContainer = onErrorContainerLight,
	background = backgroundLight,
	onBackground = onBackgroundLight,
	surface = surfaceLight,
	onSurface = onSurfaceLight,
	surfaceVariant = surfaceVariantLight,
	onSurfaceVariant = onSurfaceVariantLight,
	outline = outlineLight,
	outlineVariant = outlineVariantLight,
	scrim = scrimLight,
	inverseSurface = inverseSurfaceLight,
	inverseOnSurface = inverseOnSurfaceLight,
	inversePrimary = inversePrimaryLight,
	surfaceDim = surfaceDimLight,
	surfaceBright = surfaceBrightLight,
	surfaceContainerLowest = surfaceContainerLowestLight,
	surfaceContainerLow = surfaceContainerLowLight,
	surfaceContainer = surfaceContainerLight,
	surfaceContainerHigh = surfaceContainerHighLight,
	surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
	primary = primaryDark,
	onPrimary = onPrimaryDark,
	primaryContainer = primaryContainerDark,
	onPrimaryContainer = onPrimaryContainerDark,
	secondary = secondaryDark,
	onSecondary = onSecondaryDark,
	secondaryContainer = secondaryContainerDark,
	onSecondaryContainer = onSecondaryContainerDark,
	tertiary = tertiaryDark,
	onTertiary = onTertiaryDark,
	tertiaryContainer = tertiaryContainerDark,
	onTertiaryContainer = onTertiaryContainerDark,
	error = errorDark,
	onError = onErrorDark,
	errorContainer = errorContainerDark,
	onErrorContainer = onErrorContainerDark,
	background = backgroundDark,
	onBackground = onBackgroundDark,
	surface = surfaceDark,
	onSurface = onSurfaceDark,
	surfaceVariant = surfaceVariantDark,
	onSurfaceVariant = onSurfaceVariantDark,
	outline = outlineDark,
	outlineVariant = outlineVariantDark,
	scrim = scrimDark,
	inverseSurface = inverseSurfaceDark,
	inverseOnSurface = inverseOnSurfaceDark,
	inversePrimary = inversePrimaryDark,
	surfaceDim = surfaceDimDark,
	surfaceBright = surfaceBrightDark,
	surfaceContainerLowest = surfaceContainerLowestDark,
	surfaceContainerLow = surfaceContainerLowDark,
	surfaceContainer = surfaceContainerDark,
	surfaceContainerHigh = surfaceContainerHighDark,
	surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
	primary = primaryLightMediumContrast,
	onPrimary = onPrimaryLightMediumContrast,
	primaryContainer = primaryContainerLightMediumContrast,
	onPrimaryContainer = onPrimaryContainerLightMediumContrast,
	secondary = secondaryLightMediumContrast,
	onSecondary = onSecondaryLightMediumContrast,
	secondaryContainer = secondaryContainerLightMediumContrast,
	onSecondaryContainer = onSecondaryContainerLightMediumContrast,
	tertiary = tertiaryLightMediumContrast,
	onTertiary = onTertiaryLightMediumContrast,
	tertiaryContainer = tertiaryContainerLightMediumContrast,
	onTertiaryContainer = onTertiaryContainerLightMediumContrast,
	error = errorLightMediumContrast,
	onError = onErrorLightMediumContrast,
	errorContainer = errorContainerLightMediumContrast,
	onErrorContainer = onErrorContainerLightMediumContrast,
	background = backgroundLightMediumContrast,
	onBackground = onBackgroundLightMediumContrast,
	surface = surfaceLightMediumContrast,
	onSurface = onSurfaceLightMediumContrast,
	surfaceVariant = surfaceVariantLightMediumContrast,
	onSurfaceVariant = onSurfaceVariantLightMediumContrast,
	outline = outlineLightMediumContrast,
	outlineVariant = outlineVariantLightMediumContrast,
	scrim = scrimLightMediumContrast,
	inverseSurface = inverseSurfaceLightMediumContrast,
	inverseOnSurface = inverseOnSurfaceLightMediumContrast,
	inversePrimary = inversePrimaryLightMediumContrast,
	surfaceDim = surfaceDimLightMediumContrast,
	surfaceBright = surfaceBrightLightMediumContrast,
	surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
	surfaceContainerLow = surfaceContainerLowLightMediumContrast,
	surfaceContainer = surfaceContainerLightMediumContrast,
	surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
	surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
	primary = primaryLightHighContrast,
	onPrimary = onPrimaryLightHighContrast,
	primaryContainer = primaryContainerLightHighContrast,
	onPrimaryContainer = onPrimaryContainerLightHighContrast,
	secondary = secondaryLightHighContrast,
	onSecondary = onSecondaryLightHighContrast,
	secondaryContainer = secondaryContainerLightHighContrast,
	onSecondaryContainer = onSecondaryContainerLightHighContrast,
	tertiary = tertiaryLightHighContrast,
	onTertiary = onTertiaryLightHighContrast,
	tertiaryContainer = tertiaryContainerLightHighContrast,
	onTertiaryContainer = onTertiaryContainerLightHighContrast,
	error = errorLightHighContrast,
	onError = onErrorLightHighContrast,
	errorContainer = errorContainerLightHighContrast,
	onErrorContainer = onErrorContainerLightHighContrast,
	background = backgroundLightHighContrast,
	onBackground = onBackgroundLightHighContrast,
	surface = surfaceLightHighContrast,
	onSurface = onSurfaceLightHighContrast,
	surfaceVariant = surfaceVariantLightHighContrast,
	onSurfaceVariant = onSurfaceVariantLightHighContrast,
	outline = outlineLightHighContrast,
	outlineVariant = outlineVariantLightHighContrast,
	scrim = scrimLightHighContrast,
	inverseSurface = inverseSurfaceLightHighContrast,
	inverseOnSurface = inverseOnSurfaceLightHighContrast,
	inversePrimary = inversePrimaryLightHighContrast,
	surfaceDim = surfaceDimLightHighContrast,
	surfaceBright = surfaceBrightLightHighContrast,
	surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
	surfaceContainerLow = surfaceContainerLowLightHighContrast,
	surfaceContainer = surfaceContainerLightHighContrast,
	surfaceContainerHigh = surfaceContainerHighLightHighContrast,
	surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
	primary = primaryDarkMediumContrast,
	onPrimary = onPrimaryDarkMediumContrast,
	primaryContainer = primaryContainerDarkMediumContrast,
	onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
	secondary = secondaryDarkMediumContrast,
	onSecondary = onSecondaryDarkMediumContrast,
	secondaryContainer = secondaryContainerDarkMediumContrast,
	onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
	tertiary = tertiaryDarkMediumContrast,
	onTertiary = onTertiaryDarkMediumContrast,
	tertiaryContainer = tertiaryContainerDarkMediumContrast,
	onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
	error = errorDarkMediumContrast,
	onError = onErrorDarkMediumContrast,
	errorContainer = errorContainerDarkMediumContrast,
	onErrorContainer = onErrorContainerDarkMediumContrast,
	background = backgroundDarkMediumContrast,
	onBackground = onBackgroundDarkMediumContrast,
	surface = surfaceDarkMediumContrast,
	onSurface = onSurfaceDarkMediumContrast,
	surfaceVariant = surfaceVariantDarkMediumContrast,
	onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
	outline = outlineDarkMediumContrast,
	outlineVariant = outlineVariantDarkMediumContrast,
	scrim = scrimDarkMediumContrast,
	inverseSurface = inverseSurfaceDarkMediumContrast,
	inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
	inversePrimary = inversePrimaryDarkMediumContrast,
	surfaceDim = surfaceDimDarkMediumContrast,
	surfaceBright = surfaceBrightDarkMediumContrast,
	surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
	surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
	surfaceContainer = surfaceContainerDarkMediumContrast,
	surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
	surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
	primary = primaryDarkHighContrast,
	onPrimary = onPrimaryDarkHighContrast,
	primaryContainer = primaryContainerDarkHighContrast,
	onPrimaryContainer = onPrimaryContainerDarkHighContrast,
	secondary = secondaryDarkHighContrast,
	onSecondary = onSecondaryDarkHighContrast,
	secondaryContainer = secondaryContainerDarkHighContrast,
	onSecondaryContainer = onSecondaryContainerDarkHighContrast,
	tertiary = tertiaryDarkHighContrast,
	onTertiary = onTertiaryDarkHighContrast,
	tertiaryContainer = tertiaryContainerDarkHighContrast,
	onTertiaryContainer = onTertiaryContainerDarkHighContrast,
	error = errorDarkHighContrast,
	onError = onErrorDarkHighContrast,
	errorContainer = errorContainerDarkHighContrast,
	onErrorContainer = onErrorContainerDarkHighContrast,
	background = backgroundDarkHighContrast,
	onBackground = onBackgroundDarkHighContrast,
	surface = surfaceDarkHighContrast,
	onSurface = onSurfaceDarkHighContrast,
	surfaceVariant = surfaceVariantDarkHighContrast,
	onSurfaceVariant = onSurfaceVariantDarkHighContrast,
	outline = outlineDarkHighContrast,
	outlineVariant = outlineVariantDarkHighContrast,
	scrim = scrimDarkHighContrast,
	inverseSurface = inverseSurfaceDarkHighContrast,
	inverseOnSurface = inverseOnSurfaceDarkHighContrast,
	inversePrimary = inversePrimaryDarkHighContrast,
	surfaceDim = surfaceDimDarkHighContrast,
	surfaceBright = surfaceBrightDarkHighContrast,
	surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
	surfaceContainerLow = surfaceContainerLowDarkHighContrast,
	surfaceContainer = surfaceContainerDarkHighContrast,
	surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
	surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Composable
fun CryptoTrackerTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	// Dynamic color is available on Android 12+
	dynamicColor: Boolean = false,
	content: @Composable () -> Unit
) {
	val colorScheme = when {
		dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
			val context = LocalContext.current
			if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
		}
		
		darkTheme -> darkScheme
		else -> highContrastLightColorScheme

	}

	MaterialTheme(
		colorScheme = colorScheme,
		typography = Typography,
		content = content
	)
}
