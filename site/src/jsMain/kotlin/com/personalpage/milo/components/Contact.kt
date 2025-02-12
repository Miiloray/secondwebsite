package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Col


@Composable
fun Contact(colorMode: ColorMode,breakpoint: Breakpoint) {
    var breakpointcontact = rememberBreakpoint()

    SimpleGrid(
        numColumns = numColumns(base= 1, md = 2),
                modifier = Modifier
                .fillMaxWidth(
                if (breakpointcontact <= Breakpoint.MD) 100.percent
                else Res.Dimens.CONTACTWIDTH.px
                )
            .thenIf(
                condition = breakpointcontact > Breakpoint.MD,
                other = Modifier.height(Res.Dimens.CONTACTHEIGHT.px)
            )
            .boxShadow(
                color = Colors.Black.copy(alpha = 10),
                blurRadius = 50.px,
                spreadRadius = 50.px
            )
            .padding(all = 12.px)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
            .background( if (colorMode.isLight) Colors.LightGrey
            else Colors.DarkGrey),


    ) {

        //Leftside image
        Box(
            modifier = Modifier
                .fillMaxSize()
                .thenIf(
                    condition = breakpoint > Breakpoint.MD,
                    other = Modifier.height((Res.Dimens.CONTACTHEIGHT - 24).px)
                )


        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .objectFit(ObjectFit.Fill),
                src = Res.CONTENT.SHARK //Bilder solten 5kb< sein sosnt sieht man die nicht
            )
        }

        //Right side, text etc.
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Colors.Transparent)
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height((Res.Dimens.CONTACTHEIGHT - 24).px)
            )
        ) {
            Column() {
                SpanText(
                    text = "Directions",
                    modifier = Modifier
                        .color(if (colorMode.isLight) Colors.Black
                        else Colors.White)
                        .fontSize(30.px)
                        .margin(all = 5.px)
                        .fontWeight(FontWeight.Bold)
                        .align(
                            if (breakpointcontact <= Breakpoint.SM) Alignment.CenterHorizontally
                            else Alignment.Start
                        )

                )

                SpanText(
                    text = "Take the School of fish to the red reef and turn right at the second blue coral",
                    modifier = Modifier
                        .fontSize(26.px)
                        .margin(all = 5.px)
                        .align(
                            if (breakpointcontact <= Breakpoint.SM) Alignment.CenterHorizontally
                            else Alignment.Start
                        )
                )

                Surface(
                    modifier = Modifier //the small line under profession
                        .height(4.px)
                        .width(100.px)
                        .margin(all = 10.px)
                        .background(
                            if (colorMode.isLight) Res.Themecolor.NONPHOTBLUE.color
                            else Res.Themecolor.TRUEBLUE.color
                        )
                        .align(
                            if (breakpointcontact <= Breakpoint.SM) Alignment.CenterHorizontally
                            else Alignment.Start
                        )

                ) {}
                SpanText(
                    text = "Phone: 010-5432-1098 ",
                    modifier = Modifier
                        .color(if (colorMode.isLight) Colors.Black
                        else Colors.White)
                        .fontSize(22.px)
                        .margin(all = 5.px)
                        .align(
                            if (breakpointcontact <= Breakpoint.SM) Alignment.CenterHorizontally
                            else Alignment.Start
                        )

                )
                SpanText(
                    text = "Address: 3456 Red reef"  + "     " +
                            "shellfishroad 30",
                    modifier = Modifier
                        .color(if (colorMode.isLight) Colors.Black
                        else Colors.White)
                        .fontSize(22.px)
                        .margin(all = 5.px)
                        .align(
                            if (breakpointcontact <= Breakpoint.SM) Alignment.CenterHorizontally
                            else Alignment.Start
                        )

                )
                Row(
                    modifier = Modifier
                        .color(if (colorMode.isLight) Colors.Black
                        else Colors.White)
                        .fillMaxSize()



                ) {
                    Box(
                        modifier = Modifier
                            .margin(all = 10.px)
                            .width(175.px)
                            .height(150.px)
                    ){
                    Image(
                        modifier = Modifier
                            .fillMaxSize()
                            .objectFit(ObjectFit.Fill),
                        src = Res.CONTENT.SHARKCORAL
                    )
                    }
                    Box(
                        modifier = Modifier
                            .margin(all = 10.px)
                            //.width(340.px)
                            .height(150.px)
                            .background((if (colorMode.isLight) Colors.White
                             else Colors.Black))
                            .fillMaxWidth(
                                (if (breakpointcontact <= Breakpoint.SM) 100.percent
                                else 340.px)
                            )

                    ) {
                        Column() {
                            SpanText(
                                text = "Opening times:  ",
                                modifier = Modifier
                                    .margin(all = 5.px)
                                    .fontWeight(FontWeight.Bold)
                                    .fontSize(16.px)
                            )

                            SpanText(
                                text = "Mo-Fri: 10am to 8pm",
                                modifier = Modifier
                                    .color(if (colorMode.isLight) Colors.Black
                                    else Colors.White)
                                    .margin(all = 5.px)
                                    .fontSize(14.px)

                            )
                            SpanText(
                                text = "Weekend and Holiday: closed",
                                modifier = Modifier
                                    .color(if (colorMode.isLight) Colors.Black
                                    else Colors.White)
                                    .margin(all = 5.px)
                                    .fontSize(14.px)
                            )

                        }
                    }
                }
            }
        }
    }
}


