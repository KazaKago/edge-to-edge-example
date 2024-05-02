package com.kazakago.edgetoedge.material3.compose

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kazakago.edgetoedge.material3.compose.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLazyColumnScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("ScaffoldLazyColumnScreen") },
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Filled.Add, contentDescription = null)
            }
        },
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.consumeWindowInsets(innerPadding),
            contentPadding = innerPadding,
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
    }
}

@Preview
@Composable
fun ScaffoldLazyColumnScreenPreview() {
    AppTheme {
        ScaffoldLazyColumnScreen()
    }
}
