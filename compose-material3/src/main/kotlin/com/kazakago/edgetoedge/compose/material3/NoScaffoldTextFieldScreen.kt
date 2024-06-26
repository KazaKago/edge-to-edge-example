package com.kazakago.edgetoedge.compose.material3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kazakago.edgetoedge.compose.material3.ui.theme.AppTheme

@Composable
fun NoScaffoldTextFieldScreen(
    modifier: Modifier = Modifier,
) {
    var text by remember { mutableStateOf("") }
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding(),
        ) {
            Column(
                modifier = Modifier.imePadding(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "NoScaffoldTextFieldScreen")
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
}

@Preview
@Composable
fun NoScaffoldTextFieldScreenPreview() {
    AppTheme {
        NoScaffoldTextFieldScreen()
    }
}
