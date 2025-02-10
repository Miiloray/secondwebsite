package com.personalpage.milo.pages

import androidx.compose.runtime.*
import com.personalpage.milo.components.DarkMode
import com.personalpage.milo.components.Profilecard
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage

@Page
@Composable
fun HomePage() {
    var colorModeHome by ColorMode.currentState

    LaunchedEffect(colorModeHome) {
        val savedTheme = localStorage.getItem(Res.Icons.SAVED_THEME) ?: ColorMode.LIGHT.name
        colorModeHome = ColorMode.valueOf(savedTheme)
    }

    DarkMode(
        colorMode = colorModeHome,
        onClick = {
            colorModeHome = colorModeHome.opposite
            localStorage.setItem(Res.Icons.SAVED_THEME, colorModeHome.name)
        }
    )

    Box (
        Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from =  Res.Themecolor.TRUEBLUE.color,
                    to =  Res.Themecolor.NONPHOTBLUE.color
                )
            ),
        contentAlignment = Alignment.Center
    ){
      Profilecard(colorMode = colorModeHome) //hier callst du die Profilecard methode aus der Profilecard klasse
    }
}


