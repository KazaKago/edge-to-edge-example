package com.kazakago.edgetoedge.material2.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldDefaults
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kazakago.edgetoedge.material2.compose.ui.theme.AppTheme

@Composable
fun MainScreen(
    onClickScaffoldLazyColumnScreen: () -> Unit,
    onClickScaffoldTextFieldScreen: () -> Unit,
    onClickNoScaffoldLazyColumnScreen: () -> Unit,
    onClickNoScaffoldTextFieldScreen: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.app_name)) },
                windowInsets = WindowInsets.statusBars,
            )
        },
        contentWindowInsets = ScaffoldDefaults.contentWindowInsets, // = WindowInsets.systemBars
    ) { insetPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(insetPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = onClickScaffoldLazyColumnScreen) {
                Text(text = "ScaffoldLazyColumnScreen")
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Button(onClick = onClickScaffoldTextFieldScreen) {
                Text(text = "ScaffoldTextFieldScreen")
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Button(onClick = onClickNoScaffoldLazyColumnScreen) {
                Text(text = "NoScaffoldLazyColumnScreen")
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Button(onClick = onClickNoScaffoldTextFieldScreen) {
                Text(text = "NoScaffoldTextFieldScreen")
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    AppTheme {
        MainScreen(
            onClickScaffoldLazyColumnScreen = {},
            onClickScaffoldTextFieldScreen = {},
            onClickNoScaffoldLazyColumnScreen = {},
            onClickNoScaffoldTextFieldScreen = {},
        )
    }
}
