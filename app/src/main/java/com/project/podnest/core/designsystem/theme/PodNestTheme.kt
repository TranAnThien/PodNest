package com.project.podnest.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val PodNestLightColorScheme = lightColorScheme(
    primary = PodNestBlue,
    secondary = PodNestGreen,
    tertiary = PodNestCoral,
    surface = PodNestSurface,
    onSurface = PodNestOnSurface
)

private val PodNestDarkColorScheme = darkColorScheme(
    primary = PodNestBlue,
    secondary = PodNestGreen,
    tertiary = PodNestCoral,
    surface = PodNestDarkSurface,
    onSurface = PodNestDarkOnSurface
)

@Composable
fun PodNestTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        PodNestDarkColorScheme
    } else {
        PodNestLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = PodNestTypography,
        content = content
    )
}
