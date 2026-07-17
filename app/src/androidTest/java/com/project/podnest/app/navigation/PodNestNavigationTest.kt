package com.project.podnest.app.navigation

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.project.podnest.MainActivity
import com.project.podnest.R
import org.junit.Rule
import org.junit.Test

class PodNestNavigationTest {
    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun bottomNavigationSwitchesTopLevelDestinations() {
        val homeBody = composeRule.activity.getString(R.string.home_placeholder)
        val searchBody = composeRule.activity.getString(R.string.search_placeholder)
        val libraryBody = composeRule.activity.getString(R.string.library_placeholder)
        val settingsBody = composeRule.activity.getString(R.string.settings_placeholder)

        composeRule.onNodeWithText(homeBody).assertIsDisplayed()

        composeRule.onNodeWithTag("top_nav_search").performClick()
        composeRule.onNodeWithText(searchBody).assertIsDisplayed()

        composeRule.onNodeWithTag("top_nav_library").performClick()
        composeRule.onNodeWithText(libraryBody).assertIsDisplayed()

        composeRule.onNodeWithTag("top_nav_settings").performClick()
        composeRule.onNodeWithText(settingsBody).assertIsDisplayed()

        composeRule.onNodeWithTag("top_nav_home").performClick()
        composeRule.onNodeWithText(homeBody).assertIsDisplayed()
    }
}
