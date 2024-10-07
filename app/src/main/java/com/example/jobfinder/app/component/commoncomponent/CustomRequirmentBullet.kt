package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
@Composable
fun CustomRequirmentBullet(requirement: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 15.dp),
    ) {
        // Bullet point
        Box(modifier = Modifier
            .padding(top = 9.dp, end = 6.dp)
            .size(4.dp)
            .clip(shape = CircleShape)
            .background(Color(0xFF524B6B)))
        CustomHeading(title = requirement, textAlign = TextAlign.Start)

    }
}