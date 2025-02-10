package com.personalpage.milo.styles

import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.compose.css.Transition
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px


val Buttonfade = CssStyle{
        base{
            Modifier

                .padding(12.px)
                .background(if(colorMode.isLight) Res.Themecolor.NONPHOTBLUE.color
                else Res.Themecolor.DARKCYAN.color)
                .transition(Transition.of("all", duration = 300.ms)) //CSSTransition

        }

        hover{
             Modifier
                 .background(if (colorMode.isLight) Res.Themecolor.MOONSTONEBLUE.color
                 else Res.Themecolor.TRUEBLUE.color)
                 .padding(leftRight = 20.px)

        }

    }
