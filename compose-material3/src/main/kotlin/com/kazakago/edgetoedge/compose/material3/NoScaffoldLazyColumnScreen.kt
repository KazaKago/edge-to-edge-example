package com.kazakago.edgetoedge.compose.material3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kazakago.edgetoedge.compose.material3.ui.theme.AppTheme

@Composable
fun NoScaffoldLazyColumnScreen(
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background,
    ) {
        Box(Modifier.fillMaxSize()) {
            LazyColumn(
                modifier = Modifier.consumeWindowInsets(WindowInsets.systemBars),
                contentPadding = WindowInsets.systemBars.asPaddingValues(),
            ) {
                items(20) {
                    Card(Modifier.padding(vertical = 8.dp, horizontal = 16.dp)) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp, horizontal = 16.dp),
                            text = "Items $it",
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }
            FloatingActionButton(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(WindowInsets.systemBars.asPaddingValues())
                    .padding(16.dp),
                onClick = {},
            ) {
                Icon(Icons.Filled.Add, contentDescription = null)
            }
        }
    }
}

@Preview
@Composable
fun NoScaffoldLazyColumnScreenPreview() {
    AppTheme {
        NoScaffoldLazyColumnScreen()
    }
}
