package com.kazakago.edgetoedge.compose.material2.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val Colors = lightColors(
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
        colors = Colors,
        content = content,
    )
}
