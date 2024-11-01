package br.com.thiagoodev.criptoio.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import criptoio.composeapp.generated.resources.Alexandria_Light
import criptoio.composeapp.generated.resources.Res

private val Alexandria = FontFamily(
    Font(
        Res.font.Alexandria_Light,
        weight = FontWeight.Light,
        style = FontStyle.Normal,
    ),
)

val baseline = Typography()

val AppTypography = Typography(
    h1 = baseline.h1.copy(fontFamily = displayFontFamily),
    h2 = baseline.h2.copy(fontFamily = displayFontFamily),
    h3 = baseline.h3.copy(fontFamily = displayFontFamily),
    h4 = baseline.h4.copy(fontFamily = displayFontFamily),
    h5 = baseline.h5.copy(fontFamily = displayFontFamily),
    h6 = baseline.h6.copy(fontFamily = displayFontFamily),
    subtitle1 = baseline.subtitle1.copy(fontFamily = displayFontFamily),
    subtitle2 = baseline.subtitle2.copy(fontFamily = displayFontFamily),
    body1 = baseline.body1.copy(fontFamily = bodyFontFamily),
    body2 = baseline.body2.copy(fontFamily = bodyFontFamily),
    button = baseline.button.copy(fontFamily = bodyFontFamily),
    caption = baseline.caption.copy(fontFamily = bodyFontFamily),
    overline = baseline.overline.copy(fontFamily = bodyFontFamily),
)

