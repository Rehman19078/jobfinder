package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder.R

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    textColor: Color = Color.White,
    backgroundColors: List<Color> = listOf(Color(0xFF7551FF), Color(0xFFA993FF)),
    cornerRadius: Dp = 15.dp,
    modifier: Modifier = Modifier,
    font: FontStyle = FontStyle.MEDIUM,
) {
    val gradientBrush = Brush.linearGradient(
        colors = backgroundColors
    )

    val fontFamily = when (font) {
        FontStyle.REGULAR -> FontFamily(Font(R.font.opensansregular))
        FontStyle.BOLD -> FontFamily(Font(R.font.opensansbold))
        FontStyle.MEDIUM -> FontFamily(Font(R.font.opensansmedium))
    }

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = textColor
        ),
        shape = RoundedCornerShape(cornerRadius),
        modifier = modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(brush = gradientBrush, shape = RoundedCornerShape(cornerRadius)) // Apply gradient
    ) {
        Text(
            text = text,
            style = TextStyle(
                color = textColor, // Use customizable text color
                fontFamily = fontFamily,
                fontSize = 12.sp
            )
        )
    }
}
