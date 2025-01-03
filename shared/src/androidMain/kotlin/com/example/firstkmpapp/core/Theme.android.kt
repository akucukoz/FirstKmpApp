package com.example.firstkmpapp.core

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
actual fun ContactTheme(content: @Composable () -> Unit) {
    val colorScheme =
        if (isSystemInDarkTheme()) darkColorScheme()
        else lightColorScheme()
    MaterialTheme(colorScheme = colorScheme, content = content)
}