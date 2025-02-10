package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.styles.SytelofIcons
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfilecardAbout(colorMode: ColorMode) {

    var breakpoint2 = rememberBreakpoint()

    Box(

        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint2 <= Breakpoint.MD) 100.percent
                else Res.Dimens.MAXCARDWIDTH2.px
            )
            .thenIf(
                condition = breakpoint2 > Breakpoint.MD,
                other = Modifier.height(Res.Dimens.MAXCARDHEIGHT2.px)
            )
            .boxShadow(
                color = Colors.Black.copy(alpha = 10),
                blurRadius = 50.px,
                spreadRadius = 50.px
            )
            .padding(all = 12.px)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
            .background( Colors.White)

    ){
        Column(
        ) {
            HeaderAbout(colorMode = colorMode)
            Row(
                modifier = Modifier
                    .padding(all = 12.px) //wie viel Platz um die Icons rum ist
                    .fillMaxWidth()
                    .gap(12.px),

                horizontalArrangement = (if (breakpoint2 <= Breakpoint.SM)
                    Arrangement.Bottom else Arrangement.Start) as Arrangement.Horizontal

            ) {
                Icons.entries.filter {
                    it.name.contains("Light") // nimmt alle icons mit light im namen
                }.forEach {
                    ButtonIcon(
                        modifier = SytelofIcons.toModifier(),
                        colorMode,
                        icon = it.icon,
                        link = it.link
                    )
                }
            }
        }


    }


}