package com.kazakago.edgetoedge.material2.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldDefaults
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kazakago.edgetoedge.material2.compose.ui.theme.AppTheme

@Composable
fun ScaffoldTextFieldScreen(
    modifier: Modifier = Modifier,
) {
    var text by remember { mutableStateOf("") }
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("ScaffoldTextFieldScreen") },
                windowInsets = WindowInsets.statusBars,
            )
        },
        contentWindowInsets = ScaffoldDefaults.contentWindowInsets, // = WindowInsets.systemBars
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .consumeWindowInsets(WindowInsets.systemBars)
                .imePadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "ScaffoldTextFieldScreen")
            Spacer(modifier = Modifier.weight(1f))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                value = text,
                onValueChange = { text = it },
            )
        }
    }
}

@Preview
@Composable
fun ScaffoldTextFieldScreenPreview() {
    AppTheme {
        ScaffoldTextFieldScreen()
    }
}
