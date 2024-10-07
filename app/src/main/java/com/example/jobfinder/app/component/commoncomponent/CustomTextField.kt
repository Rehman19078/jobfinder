package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder.R

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String = "",
    fontSize: Int = 12,
    isPassword: Boolean = false,  // New parameter to identify password fields
    showTrailingIcon: Boolean = false, // Optional flag for trailing icon visibility
    font: FontStyle = FontStyle.MEDIUM,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = if (isPassword) KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done)
    else KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email, imeAction = ImeAction.Done),
) {
    var passwordVisible by remember { mutableStateOf(false) }

    val fontFamily = remember {
        when (font) {
            FontStyle.REGULAR -> FontFamily(Font(R.font.opensansregular))
            FontStyle.BOLD -> FontFamily(Font(R.font.opensansbold))
            FontStyle.MEDIUM -> FontFamily(Font(R.font.opensansmedium))
        }
    }

    TextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                style = TextStyle(
                    color = Color(0xFF524B6B),
                    fontFamily = fontFamily,
                    fontSize = fontSize.sp
                )
            )
        },
        textStyle = TextStyle(
            fontFamily = fontFamily,
            fontSize = fontSize.sp
        ),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            cursorColor = Color.Black
        ),
        visualTransformation = if (isPassword && !passwordVisible) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            if (isPassword && showTrailingIcon) {
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(
                        imageVector = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff,
                        contentDescription = if (passwordVisible) "Hide password" else "Show password"
                    )
                }
            }
        },
        shape = RoundedCornerShape(8.dp),
        keyboardOptions = keyboardOptions,
        modifier = modifier.fillMaxWidth()
    )
}
