package com.project.podnest.feature.settings

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.project.podnest.R
import com.project.podnest.core.designsystem.component.PlaceholderScreen
import com.project.podnest.core.designsystem.theme.PodNestTheme

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    PlaceholderScreen(
        title = stringResource(R.string.settings_title),
        body = stringResource(R.string.settings_placeholder),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun SettingsScreenPreview() {
    PodNestTheme {
        SettingsScreen()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SettingsScreenDarkPreview() {
    PodNestTheme {
        SettingsScreen()
    }
}
