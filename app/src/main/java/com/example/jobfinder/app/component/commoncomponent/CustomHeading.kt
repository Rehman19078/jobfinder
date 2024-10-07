package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.jobfinder.R

@Composable
fun CustomHeading(
    title: String,
    color: Color = Color(0xFF524B6B),
    fontSize: TextUnit = 12.sp,
    font: FontStyle = FontStyle.REGULAR,
    textAlign: TextAlign = TextAlign.Center,
    modifier: Modifier = Modifier,
    lineHeight: TextUnit = 20.sp,
) {
    val fontFamily = when (font) {
        FontStyle.REGULAR -> FontFamily(Font(R.font.opensansregular))
        FontStyle.BOLD -> FontFamily(Font(R.font.opensansbold))
        FontStyle.MEDIUM -> FontFamily(Font(R.font.opensansmedium))
    }

    Text(
        text = title,
        fontSize = fontSize,
        fontFamily = fontFamily,
        color = color,
        lineHeight = lineHeight,
        textAlign = textAlign,
        modifier = modifier
    )
}
