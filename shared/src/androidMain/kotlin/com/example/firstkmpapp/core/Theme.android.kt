package com.example.firstkmpapp.core

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
actual fun ContactTheme(content: @Composable () -> Unit) {
    MaterialTheme(content = content)
}