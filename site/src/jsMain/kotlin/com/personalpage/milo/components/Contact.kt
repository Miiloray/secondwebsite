package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Column
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
            .background( if (colorMode.isLight) Colors.Pink
            else Colors.Purple),


    ){

        //Leftside image
        Image(
            modifier = Modifier
                .fillMaxSize()
                .objectFit(ObjectFit.Fill),
            src = Res.CONTENT.CORAL //Bilder solten 5kb< sein sosnt sieht man die nicht
        )

        //Right side, text etc.
        Column() {
            SpanText(
                text = "Adresse",
                modifier = Modifier
                    .fontSize(25.px)
            )

            SpanText(
                text = "Rest blablabla",
                modifier = Modifier
                    .fontSize(15.px)
            )

            Surface(
                modifier = Modifier //the small line under profession
                    .height(4.px)
                    .width(40.px)
                    .margin(bottom = 18.px)
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
                text = "Hallo",
                modifier = Modifier
                    .fontSize(15.px)

            )
        }

    }
}