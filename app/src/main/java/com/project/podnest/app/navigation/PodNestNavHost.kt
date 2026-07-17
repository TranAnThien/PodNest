package com.project.podnest.app.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.project.podnest.feature.home.HomeScreen
import com.project.podnest.feature.library.LibraryScreen
import com.project.podnest.feature.search.SearchScreen
import com.project.podnest.feature.settings.SettingsScreen

@Composable
fun PodNestNavHost(
    navController: NavHostController,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    startDestination: String = TopLevelDestination.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier.padding(contentPadding)
    ) {
        composable(TopLevelDestination.Home.route) { HomeScreen() }
        composable(TopLevelDestination.Search.route) { SearchScreen() }
        composable(TopLevelDestination.Library.route) { LibraryScreen() }
        composable(TopLevelDestination.Settings.route) { SettingsScreen() }
    }
}
