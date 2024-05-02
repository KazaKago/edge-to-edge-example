package com.kazakago.edgetoedge.compose.material3.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val ColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    surface = Purple80,
    background = PurpleGrey80,
)

@Composable
fun AppTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = ColorScheme,
        content = content,
    )
}
