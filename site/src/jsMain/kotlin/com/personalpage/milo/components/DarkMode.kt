package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.personalpage.milo.styles.Darkmodestyle
import com.personalpage.milo.util.Res
import com.personalpage.milo.util.Res.Dimens.ICON_SIZE
import com.personalpage.milo.util.Res.Dimens.ICON_SIZE_LG
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px

@Composable
fun DarkMode(
    colorMode: ColorMode,
    onClick: () -> Unit,
){
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1f)
            .styleModifier {
                property("pointer-events", "none")
            },
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End     //rechts
    ){
        ButtonIcon(
            modifier = Darkmodestyle.toModifier()
                .margin(all = if (breakpoint > Breakpoint.SM) 24.px else 16.px)
                .styleModifier {
                    property("pointer-events", "auto")
                },
            colorMode = colorMode,
            icon = if (colorMode.isLight) Res.Icons.HOUSEDAY else Res.Icons.HOUSENIGHT,
            iconSize = if (breakpoint > Breakpoint.SM) ICON_SIZE_LG.px else ICON_SIZE.px,
            onClick = onClick
        )
    }

}