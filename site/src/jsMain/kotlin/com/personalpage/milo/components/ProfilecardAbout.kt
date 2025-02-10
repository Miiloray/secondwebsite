package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.styles.SytelofIcons
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box

import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfilecardAbout(colorMode: ColorMode) {

    var breakpoint2 = rememberBreakpoint()

    Box(
        modifier = Modifier
          /*  .fillMaxWidth(
                if (breakpoint2 <= Breakpoint.MD) 100.percent
                else Res.Dimens.MAXCARDWIDTH2.px
            )
            .thenIf(
                condition = breakpoint2 > Breakpoint.MD,
                other = Modifier.height(Res.Dimens.MAXCARDHEIGHT2.px)
            ) */
          /*  .boxShadow(
                color = Colors.Black.copy(alpha = 10),
                blurRadius = 50.px,
                spreadRadius = 50.px
            )*/
            .padding(all = 12.px)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
            .background( if (colorMode.isLight) Colors.White
                        else Colors.Gray)
            .fillMaxWidth(Res.Dimens.MAXCARDWIDTH2.px)
            .height(Res.Dimens.MAXCARDHEIGHT2.px),


    ){
        Column(
        ) {
            HeaderAbout(colorMode = colorMode) //blauer header
            Row(            //um das arragnement zu ändern muss das in der Box/Row etc stehen
                modifier = Modifier
                .padding(all = 12.px) //wie viel Platz um die Icons rum ist
                .fillMaxWidth()
                .gap(12.px),

                horizontalArrangement = if (breakpoint2 <= Breakpoint.SM)
                    Arrangement.Center else Arrangement.Start)
            {
            SpanText(                           //text
                text = Res.CONTENT.NEWTEXT, //"press homepage..."
                modifier = Modifier
                    .margin (bottom = 12.px)
                    .fontSize(24.px)
                    .color(if (colorMode.isLight) Colors.Black
                            else Res.Themecolor.MOONSTONEBLUE.color)
                    .lineHeight(2)

            )
            }
            Row(                            //Icons
                modifier = Modifier
                    .padding(all = 12.px) //wie viel Platz um die Icons rum ist
                    .fillMaxWidth()
                    .gap(12.px),

                horizontalArrangement = if (breakpoint2 <= Breakpoint.SM)
                    Arrangement.Center else Arrangement.Start

            ) {
                Icons.entries.filter {
                    if (colorMode.isLight) !it.name.contains("Light")
                    else it.name.contains("Light")// nimmt alle icons mit light im namen
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