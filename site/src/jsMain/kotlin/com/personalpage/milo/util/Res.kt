package com.personalpage.milo.util

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

object Res {

    enum class Themecolor(val color: CSSColorValue){
        WHITE(color = rgb(255, 255, 255)),
        BLACK(color = rgb(0, 0, 0)),
        TRUEBLUE(color = rgb(r = 48, g = 102, b = 190)),
        RICHBLACK(color = rgb(r = 0, g = 16, b = 17)),
        NONPHOTBLUE(color = rgb(r = 138, g = 225, b = 252)),
        MOONSTONEBLUE(color = rgb(r = 72, g = 184, b = 208)),
        DARKCYAN(color = rgb(r = 33, g = 137, b = 126))
    }

    object Icons {
        const val PICTURE = "portraitsvg.svg"
        const val INFO = "info.svg"
        const val INFODARK = "infodark.svg"
        const val ENVELOPE_LIGHT = "envelope.svg"
        const val ENVELOPE_DARK ="envelopedark.svg"
        const val CAT_LIGHT = "sleeping-cat.svg"
        const val CATDARK = "sleeping-catdark.svg"
        const val USER_LIGHT = "user.svg"
        const val USERDARK = "userdark.svg"
        const val HOUSEDAY = "houseday.svg"
        const val HOUSENIGHT = "housenight.svg"
        const val SAVED_THEME = "theme"
    }

    object CONTENT {
        const val FOTO = "portrait.png"
        const val CORAL = "coral.png"
        const val SHARK = "shark.png"
        const val SHARKCORAL = "sharkcoral.png"
        const val CORALREEF = "coralreef.png"
        const val FUNFACT = "Shark fun facts:     "
        const val ABOUT =
                            "Blue sharks are really blue. " +
                            " It displays a brilliant blue color on the upper portion of its body " +
                "and is normally snowy white beneath. The mako and porbeagle sharks" +
                " also exhibit a blue coloration, but it is not nearly as brilliant" +
                " as that of a blue shark. In life, most sharks are brown, olive, or grayish."
        const val NEWTEXT = "Press 'Homepage' to return to the Homepage  "
        const val NAME = "Tigershark"
        const val OCCUPATION = "Shark"
        const val EMAIL = "email"
        const val PANCAKE = "Pancake"
        const val LAZYTYPE = "Lazytype"
        const val MY_EMAIL = "mailto:mailo@gmail.com"
        const val ABOUTPAGE = "About"

    }

    object Dimens{
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000 //profiole card
        const val MAXCARDWIDTH2 = 1200//breite //profilecard about
        const val MAX_CARD_HEIGHT = 600
        const val MAXCARDHEIGHT2 = 610 //hoehe
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
        const val CARDHEADHEIGHT = 100 //box in profilecard about
        const val CARDHEADWIDTH = 1175 //box in profilecard about
        const val CONTACTWIDTH = 1175   //contactpage
        const val CONTACTHEIGHT = 425 //constact page
        const val SHARKWIDTH = 340 //sharkbox

    }
}