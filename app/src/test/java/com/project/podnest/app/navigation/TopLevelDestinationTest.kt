package com.project.podnest.app.navigation

import org.junit.Assert.assertEquals
import org.junit.Test

class TopLevelDestinationTest {
    @Test
    fun topLevelDestinationsUseStableRoutes() {
        assertEquals(
            listOf("home", "search", "library", "settings"),
            TopLevelDestination.entries.map { it.route }
        )
    }

    @Test
    fun topLevelDestinationsUseStableTestTags() {
        assertEquals(
            listOf("top_nav_home", "top_nav_search", "top_nav_library", "top_nav_settings"),
            TopLevelDestination.entries.map { it.testTag }
        )
    }
}
