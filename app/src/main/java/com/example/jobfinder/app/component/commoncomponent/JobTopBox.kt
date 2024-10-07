package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder.R

@Composable
fun JobTopBox(
    title: String,
    companyinfo: String,
    painter: Painter,
    contentDescription: String?,
    jobTags: List<String>,
    onTagClick: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(225.dp)
            .clip(shape = RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp))
    ) {
        CustomImage(painter = painterResource(id = R.drawable.topbar), contentDescription = "topbar")
        Column(
            modifier = Modifier.padding(start = 22.dp, end = 20.dp, top = 18.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                Modifier
                    .fillMaxWidth(),

                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomImage(
                    painter = painterResource(id = R.drawable.backarrowicon),
                    contentDescription = "backarrow"
                )
                Spacer(modifier = Modifier.weight(1f))
                CustomImage(
                    painter = painterResource(id = R.drawable.optionicon),
                    contentDescription = "option"
                )

            }
            CustomImage(
                painter = painter,
                contentDescription = contentDescription,
            )
            Spacer(modifier = Modifier.height(5.dp))
            CustomTittle(title = title, fontSize = 16.sp, color = Color.White)
            CustomHeading(title = companyinfo, color = Color.White)
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                jobTags.forEach { tag ->
                    Button(
                        onClick = { onTagClick(tag) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF9073FF),
                            contentColor = Color(0xFFFFFFFF)
                        ),
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .size(width = 90.dp, height = 35.dp)
                    ) {
                        Text(text = tag, fontSize = 10.sp)
                    }
                }
            }
        }

    }
}

