package com.personalpage.milo.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.personalpage.milo.components.DarkMode
import com.personalpage.milo.components.ProfilecardAbout
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage

@Page
@Composable
fun Aboutpage() {

    var colormodeabout by ColorMode.currentState
    var colormodecontact by ColorMode.currentState
    var breakpointabout = rememberBreakpoint()

    LaunchedEffect(colormodeabout) {
        val savedTheme = localStorage.getItem(Res.Icons.SAVED_THEME) ?: ColorMode.LIGHT.name
        colormodeabout = ColorMode.valueOf(savedTheme)
    }

    DarkMode(
        colorMode = colormodeabout,
        onClick = {
            colormodeabout = colormodeabout.opposite
            localStorage.setItem(Res.Icons.SAVED_THEME, colormodeabout.name)
        }
    )

    Box (
        Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from =  if (colormodeabout.isLight) Res.Themecolor.TRUEBLUE.color
                            else Res.Themecolor.NONPHOTBLUE.color,
                    to =  if (colormodeabout.isLight) Res.Themecolor.NONPHOTBLUE.color
                        else Res.Themecolor.RICHBLACK.color
                )
            ),
        contentAlignment = Alignment.Center
    ){
        //HeaderAbout(colorMode = colormodeabout)
        ProfilecardAbout(colorMode = colormodeabout)
        //Contact(colorMode = colormodeabout, breakpoint = breakpointabout)


    }
}
