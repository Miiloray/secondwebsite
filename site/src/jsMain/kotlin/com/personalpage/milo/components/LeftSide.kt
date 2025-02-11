package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.styles.Buttonfade
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineStart
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun LeftSide(
    colorMode: ColorMode,
    breakpoint: Breakpoint){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px)
    ){
        SpanText(
            text = Res.CONTENT.NAME,
            modifier = Modifier
                .margin(top = 24.px)
                .fontFamily(Res.CONTENT.LAZYTYPE)
                .color(if(colorMode.isLight)Res.Themecolor.NONPHOTBLUE.color
                        else Res.Themecolor.TRUEBLUE.color)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )

        SpanText(
            text = Res.CONTENT.OCCUPATION,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.CONTENT.PANCAKE)
                .color(if(colorMode.isLight)Res.Themecolor.NONPHOTBLUE.color
                else Res.Themecolor.TRUEBLUE.color)
                .fontSize(24.px)
        )
        Surface(
            modifier = Modifier //the small line under profession
                .height(4.px)
                .width(40.px)
                .margin(bottom = 18.px)
                .background(if(colorMode.isLight)Res.Themecolor.NONPHOTBLUE.color
                else Res.Themecolor.TRUEBLUE.color)
                .align(
                    if(breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ){}
        SpanText(
            text = Res.CONTENT.FUNFACT,
            modifier = Modifier
                .margin(top = 16.px)
                .fontWeight(FontWeight.Bold)
                .fontFamily(Res.CONTENT.LAZYTYPE)
                .fontSize(22.px)
                .color(if(colorMode.isLight)Res.Themecolor.MOONSTONEBLUE.color
                else Res.Themecolor.TRUEBLUE.color)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.CONTENT.ABOUT,
            modifier = Modifier
                .margin(bottom = 14.px)
                .fontFamily(Res.CONTENT.LAZYTYPE)
                .fontSize(20.px)
                .color(if(colorMode.isLight)Res.Themecolor.MOONSTONEBLUE.color
                else Res.Themecolor.TRUEBLUE.color)
                .opacity(100.percent)
                .lineHeight(2)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        Button(
            modifier = Buttonfade.toModifier()
                .margin(top = 12.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = "http://localhost:8080/about"}
        ){
            Image(
                modifier = Modifier
                    .margin (right = 12.px),
                src = if (colorMode.isLight) Res.Icons.INFODARK
                else Res.Icons.INFO,
            )
            SpanText(
                text = Res.CONTENT.ABOUTPAGE,
                modifier = Modifier
                    .fontSize(24.px)
                    .color(if(colorMode.isLight)Res.Themecolor.WHITE.color
                    else Res.Themecolor.BLACK.color)
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.CONTENT.LAZYTYPE)
            )
        }

    }
}