package com.example.clipboardvault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.clipboardvault.ui.home.HomeScreen
import com.example.clipboardvault.ui.theme.ClipboardVaultTheme

/**
 *  * 应用唯一入口（Single Activity）。
 *   * 所有页面（列表 / 编辑）后续均通过 Compose Navigation 在此承载。
 *    */
 class MainActivity : ComponentActivity() {
	 override fun onCreate(savedInstanceState: Bundle?) {
		 super.onCreate(savedInstanceState)
		 enableEdgeToEdge()
		 setContent {
			 ClipboardVaultTheme {
				 HomeScreen()
			 }
		 }
	 }
 }

