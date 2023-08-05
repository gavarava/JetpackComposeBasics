package com.devsolveab.jetpackcomposebasics.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devsolveab.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

@Composable
fun MyApp(modifier: Modifier = Modifier) {

    var shouldShowOnboarding by remember { mutableStateOf(true) }

    Surface(modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false }, modifier)
        } else {
            Greetings()
        }
    }
}

@Preview
@Composable
fun MyAppPreview() {
    JetpackComposeBasicsTheme {
        MyApp(Modifier.fillMaxSize())
    }
}

