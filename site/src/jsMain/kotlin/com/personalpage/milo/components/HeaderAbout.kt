package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun HeaderAbout(colorMode: ColorMode){

    var breakpoint3 = rememberBreakpoint()
    val ctx2 = rememberPageContext()

    Box(
        contentAlignment = if (breakpoint3 <= Breakpoint.SM) Alignment.TopCenter
        else Alignment.TopStart,
        modifier = Modifier

            .fillMaxWidth(if (breakpoint3 <= Breakpoint.SM) 100.percent
                else Res.Dimens.CARDHEADWIDTH.px)

            .padding(all = 12.px)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
            .background(if (colorMode.isLight) Colors.Navy
                else Colors.Black),

          //  contentAlignment = Alignment.TopCenter //das ist nur für was inn der box stehthorizontalArrangement = if (breakpoint2 <= Breakpoint.SM)
        //                    Arrangement.Center else Arrangement.Start
    ){
            SpanText(
                text = "Homepage",
                modifier = Modifier
                    .cursor(Cursor.Pointer)
                    .color(if (colorMode.isLight) Colors.White
                        else Colors.White)
                    .onClick {ctx2.router.navigateTo("/")
                    }
            )
        }

    }

