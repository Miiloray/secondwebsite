package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.styles.Buttonfade
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun LeftSide(breakpoint: Breakpoint){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px)
    ){
        SpanText(
            text = Res.CONTENT.NAME,
            modifier = Modifier
                .margin(top = 12.px)
                .fontFamily(Res.CONTENT.LAZYTYPE)
                .color(Colors.BlueViolet)
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
                .margin(bottom = 24.px)
                .fontFamily(Res.CONTENT.PANCAKE)
                .color(Colors.DarkCyan)
                .fontSize(18.px)
        )
        Surface(
            modifier = Modifier //the small line under profession
                .height(4.px)
                .width(40.px)
                .margin(bottom = 18.px)
                .background(Colors.Blue)
                .align(
                    if(breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ){}
        SpanText(
            text = Res.CONTENT.ABOUT,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.CONTENT.LAZYTYPE)
                .fontSize(20.px)
                .color(Colors.LightBlue)
                .opacity(60.percent)
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
                src = Res.Icons.INFO,
            )
            SpanText(
                text = Res.CONTENT.EMAIL,
                modifier = Modifier
                    .fontSize(24.px)
                    .color(Colors.White)
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.CONTENT.LAZYTYPE)
            )
        }

    }
}