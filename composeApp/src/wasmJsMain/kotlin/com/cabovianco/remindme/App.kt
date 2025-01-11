package com.cabovianco.remindme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontFamily
import com.cabovianco.remindme.view.Main
import org.jetbrains.compose.resources.Font
import remindme_privacy_policy.composeapp.generated.resources.JetBrainsMono

import remindme_privacy_policy.composeapp.generated.resources.Res

@Composable
fun App() {
    MaterialTheme(
        typography = Typography(defaultFontFamily = FontFamily(Font(Res.font.JetBrainsMono)))
    ) {
        Main()
    }
}
