package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchField(){
    var searchtext by remember { mutableStateOf("") }

    TextField(
        value = searchtext,
        onValueChange = {
            searchtext = it
        },
        placeholder = {
            CustomHeading(title = "Search for job")
        },
        modifier = Modifier
            .height(50.dp)
            .width(280.dp), 
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedIndicatorColor = Color.Transparent, 
            unfocusedIndicatorColor = Color.Transparent, 
            cursorColor = Color.Black
        ),
        shape = RoundedCornerShape(12.dp),
        textStyle = TextStyle(
            fontSize = 14.sp
        ),
                singleLine = true,
    )

}