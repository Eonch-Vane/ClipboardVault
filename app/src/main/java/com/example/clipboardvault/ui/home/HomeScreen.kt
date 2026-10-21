package com.example.clipboardvault.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.clipboardvault.R

/**
 *  * 首页占位（阶段 0）：
 *   * 仅包含标题栏与空数据提示。搜索框、列表、FAB 属阶段 3，此处刻意不实现。
 *    */
 @OptIn(ExperimentalMaterial3Api::class)
 @Composable
 fun HomeScreen() {
	 Scaffold(
		 topBar = {
			 TopAppBar(
				 title = { Text(stringResource(R.string.app_name)) }
			 )
		 }
	 ) { innerPadding ->
		 Box(
			 modifier = Modifier
			 .fillMaxSize()
			 .padding(innerPadding),
			 contentAlignment = Alignment.Center
		 ) {
			 Text(
				 text = stringResource(R.string.empty_hint),
				 style = MaterialTheme.typography.bodyLarge,
				 color = MaterialTheme.colorScheme.onSurfaceVariant,
				 textAlign = TextAlign.Center,
				 modifier = Modifier.padding(horizontal = 32.dp)
			 )
		 }
	 }
 }

