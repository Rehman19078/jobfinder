package com.example.jobfinder.app.presentation.applyjob.jobdescription

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder.R
import com.example.jobfinder.app.component.commoncomponent.CustomButton
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomImage
import com.example.jobfinder.app.component.commoncomponent.CustomRequirmentBullet
import com.example.jobfinder.app.component.commoncomponent.CustomTittle

@Composable
fun TabScreen1() {
    // List of requirements
    val requirements = listOf(
        "Sed ut perspiciatis unde omnis iste natus error sit.",
        "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur & adipisci velit.",
        "Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit.",
        "Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur."
    )
    //list of facilities
    val facilites = listOf(
        "Medical",
        "Dental",
        "Technical Cartification",
        "Meal Allowance",
        "Transport Allowance",
        "Regular Hours",
        "Mondays-Fridays"
    )
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        CustomTittle(title = "Job Description", fontSize = 14.sp)
        Spacer(modifier = Modifier.height(15.dp))
        CustomHeading(
            title = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem ...",
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(12.dp))
        CustomButton(
            text = "Read More",
            textColor = Color(0xFF7551FF),
            onClick = { /*TODO*/ },
            backgroundColors = listOf(Color(0xFFDED7FA), Color(0xFFDED7FA)),
            modifier = Modifier
                .width(110.dp)
                .height(30.dp),
        )
        Spacer(modifier = Modifier.height(25.dp))
        CustomTittle(title = "Requirements", fontSize = 14.sp)
        requirements.forEach { requirement ->
            CustomRequirmentBullet(requirement)
        }
        // Spacer(modifier = Modifier.height(10.dp))
        CustomTittle(title = "Location", fontSize = 14.sp)
        CustomHeading(title = "Overlook Avenue, Belleville, NJ, USA")
        Spacer(modifier = Modifier.height(17.dp))
        CustomImage(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "map",
            modifier = Modifier.height(151.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Informations", fontSize = 14.sp, lineHeight = 16.sp)
       Spacer(modifier = Modifier.height(15.dp))
        CustomTittle(title = "Position", fontSize = 12.sp,lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(title = "Senior Designer", lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Qualification", fontSize = 12.sp,lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(title = "Bachelor’s Degree", lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Experience", fontSize = 12.sp,lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(title = "3 Years", lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Job Type", fontSize = 12.sp,lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(title = "Full-Time", lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Specialization", fontSize = 12.sp,lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(title = "Design", lineHeight = 16.sp)
        Spacer(modifier = Modifier.height(30.dp))
        CustomTittle(title = "Facilities and Others", fontSize = 14.sp,lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(15.dp))
        facilites.forEach { requirement ->
            CustomRequirmentBullet(requirement)
        }


    }
}