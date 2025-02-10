package com.personalpage.milo.components

import androidx.compose.runtime.Composable
import com.personalpage.milo.util.Res
import com.personalpage.milo.util.Res.Dimens.BORDER_RADIUS
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun ButtonIcon(     //no idea lol
    modifier: Modifier = Modifier,
    colorMode: ColorMode,
    link:String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick:(()->Unit)? = null
)

    {
        Link(path = link ){
        Box(
            modifier = modifier
                .padding(all = 8.px)
                .borderRadius(r = BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color = Res.Themecolor.TRUEBLUE.color //umrandung für die icons
                )
                .onClick { onClick?.invoke() }

        ){
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}
enum class Icons(
    val icon: String,
    val link: String
) {

    EmailLight(         //Hier muss light oder dark stehen
        icon = Res.Icons.ENVELOPE_LIGHT,
        link = Res.CONTENT.EMAIL
    ),

    Email(
    icon = Res.Icons.ENVELOPE_DARK,
    link = Res.CONTENT.MY_EMAIL
    ),

    CatLight(
        icon = Res.Icons.CAT_LIGHT,
        link = "https://github.com/Miiloray"
    ),

    Cat(
        icon = Res.Icons.CATDARK,
        link = "https://github.com/Miiloray"
    ),

    InstaLight(
        icon = Res.Icons.USER_LIGHT,
        link = "https://www.instagram.com/miiloray/"
    ),

    Insta(
        icon = Res.Icons.USERDARK,
        link = "https://www.instagram.com/miiloray/"
    ),
}