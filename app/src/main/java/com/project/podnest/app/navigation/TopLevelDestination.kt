package com.project.podnest.app.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.project.podnest.R

enum class TopLevelDestination(
    val route: String,
    @param:StringRes @get:StringRes val labelResId: Int,
    @param:DrawableRes @get:DrawableRes val iconResId: Int,
    val testTag: String
) {
    Home("home", R.string.home_title, R.drawable.ic_nav_home, "top_nav_home"),
    Search("search", R.string.search_title, R.drawable.ic_nav_search, "top_nav_search"),
    Library("library", R.string.library_title, R.drawable.ic_nav_library, "top_nav_library"),
    Settings("settings", R.string.settings_title, R.drawable.ic_nav_settings, "top_nav_settings")
}
