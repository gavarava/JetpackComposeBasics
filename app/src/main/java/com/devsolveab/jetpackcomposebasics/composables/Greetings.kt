package com.devsolveab.jetpackcomposebasics.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devsolveab.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

@Composable
fun Greetings(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("Lorem", "Ipsum", "Dolor", "Amet")
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier = modifier.padding(vertical = 8.dp)) {
            for (name in names) {
                Greeting(name = name)
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun GreetingsPreview() {
    JetpackComposeBasicsTheme {
        Greetings(Modifier.fillMaxSize())
    }
}