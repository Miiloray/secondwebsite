package com.personalpage.milo.styles

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val Homepage = CssStyle{
    base {
        Modifier
            .padding(12.px)
            .background(Colors.Blue)
            .transition(Transition.of("all", duration = 300.ms)) //CSSTransition

    }
    hover{
        Modifier
            .background(Colors.DarkCyan)
            .padding(leftRight = 20.px)
    }
}