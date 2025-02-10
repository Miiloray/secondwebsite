package com.personalpage.milo.styles

import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms

val SytelofIcons = CssStyle {
    base {
        Modifier
            .rotate(0.deg)
            .background(if (colorMode.isLight) Res.Themecolor.TRUEBLUE.color
            else Res.Themecolor.NONPHOTBLUE.color)
            .transition(
                Transition.of("rotate", duration = 300.ms),
                Transition.of(property = "background", duration = 300.ms)
            )
    }
    hover {
        Modifier
            .rotate(10.deg)
            .background(if (colorMode.isLight) Res.Themecolor.MOONSTONEBLUE.color
            else Res.Themecolor.DARKCYAN.color)
    }
}

    val Darkmodestyle = CssStyle {
        base {
            Modifier
                .background(
                    if (colorMode.isLight) Colors.White
                    else Res.Themecolor.NONPHOTBLUE.color
                )
                .transition(
                    Transition.Companion.of("background", duration = 300.ms)
                )
        }
        hover {
            Modifier
                .background(
                    if (colorMode.isLight) Colors.LightBlue
                    else Res.Themecolor.TRUEBLUE.color
                )
        }
    }
