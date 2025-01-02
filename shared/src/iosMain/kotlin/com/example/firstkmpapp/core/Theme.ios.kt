package com.example.firstkmpapp.core

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

@Composable
actual fun ContactTheme(content: @Composable () -> Unit) {
    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
                UIUserInterfaceStyle.UIUserInterfaceStyleDark
    val colorScheme =
        if (isDarkTheme) darkColorScheme()
        else lightColorScheme()
    MaterialTheme(colorScheme = colorScheme, content = content)
}