package com.project.podnest.feature.home

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.project.podnest.R
import com.project.podnest.core.designsystem.component.PlaceholderScreen
import com.project.podnest.core.designsystem.theme.PodNestTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    PlaceholderScreen(
        title = stringResource(R.string.home_title),
        body = stringResource(R.string.home_placeholder),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    PodNestTheme {
        HomeScreen()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HomeScreenDarkPreview() {
    PodNestTheme {
        HomeScreen()
    }
}
