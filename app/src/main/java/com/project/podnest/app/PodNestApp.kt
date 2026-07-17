package com.project.podnest.app

import androidx.compose.runtime.Composable
import com.project.podnest.app.navigation.PodNestScaffold
import com.project.podnest.core.designsystem.theme.PodNestTheme

@Composable
fun PodNestApp() {
    PodNestTheme {
        PodNestScaffold()
    }
}
