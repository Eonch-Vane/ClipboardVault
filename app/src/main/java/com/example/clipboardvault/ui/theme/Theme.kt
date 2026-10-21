package com.example.clipboardvault.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColors = lightColorScheme(
	primary = TealPrimary,
	onPrimary = TealOnPrimary,
	primaryContainer = TealPrimaryContainer,
	onPrimaryContainer = TealOnPrimaryContainer,
	secondary = TealSecondary,
	onSecondary = TealOnSecondary,
	secondaryContainer = TealSecondaryContainer,
	onSecondaryContainer = TealOnSecondaryContainer,
	background = TealBackground,
	onBackground = TealOnBackground,
	surface = TealSurface,
	onSurface = TealOnSurface,
	surfaceVariant = TealSurfaceVariant,
	onSurfaceVariant = TealOnSurfaceVariant,
	outline = TealOutline
)

private val DarkColors = darkColorScheme(
	primary = TealPrimaryContainer,
	onPrimary = TealPrimary,
	secondary = TealSecondaryContainer,
	onSecondary = TealSecondary,
	background = TealOnBackground,
	onBackground = TealBackground,
	surface = TealOnBackground,
	onSurface = TealBackground,
	surfaceVariant = TealOnSurfaceVariant,
	onSurfaceVariant = TealSurfaceVariant,
	outline = TealOutline
)

/**
 *  * 应用统一主题入口。minSdk = 31，全部设备支持 Material You 动态取色；
 *   * 关闭动态取色时回退到上面的静态色板。
 *    */
 @Composable
 fun ClipboardVaultTheme(
	 darkTheme: Boolean = isSystemInDarkTheme(),
	 dynamicColor: Boolean = true,
	 content: @Composable () -> Unit
 ) {
	 val colorScheme = when {
		 dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
			 val context = LocalContext.current
			 if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
		 }
		 darkTheme -> DarkColors
		 else -> LightColors
	 }

	 MaterialTheme(
		 colorScheme = colorScheme,
		 typography = Typography,
		 content = content
	 )
 }

