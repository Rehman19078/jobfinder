package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder.R

@Composable
fun CustomJobCard(
    jobTitle: String,
    companyInfo: String,
    salary: String,
    jobTags: List<String>,
    onTagClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp,)
            .height(173.dp),
        colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        )
    ) {
        Column(Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(21.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 27.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    CustomImage(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "google", Modifier.padding(end = 6.dp)
                    )

                    Column {
                        CustomHeading(title = jobTitle, font = FontStyle.BOLD)
                        CustomHeading(title = companyInfo)
                    }
                }
                Icon(
                    painter = painterResource(id = R.drawable.save),
                    contentDescription = "save"
                )
            }
            Spacer(modifier = Modifier.height(13.dp))
            CustomTittle(
                title = salary,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                jobTags.forEach { tag ->
                    Button(
                        onClick = { onTagClick(tag) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF2F2F4),
                            contentColor = Color(0xFF524B6B)
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
