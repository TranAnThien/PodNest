package com.project.podnest

import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class MainActivityStartupTest {
    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun mainActivityShowsPodNestHomeInsteadOfTemplateGreeting() {
        val homeBody = composeRule.activity.getString(R.string.home_placeholder)

        composeRule.onNodeWithText(homeBody).assertIsDisplayed()
        composeRule.onAllNodesWithText("Hello Android!").assertCountEquals(0)
    }
}
