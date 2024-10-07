package com.example.jobfinder.app.presentation.applyjob.jobdescription

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomTittle

@Composable
fun TabScreen2() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        CustomTittle(title = "About Company", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(20.dp))
        CustomHeading(
            title = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.",
            lineHeight = 16.sp,
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Website", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(
            title = "https://www.google.com",
            lineHeight = 16.sp,
            color = Color(0xFF7551FF)
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Industry", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(
            title = "Internet product",
            lineHeight = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Employee size", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(
            title = "132,121 Employees",
            lineHeight = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Head office", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(
            title = "Mountain View, California, Amerika Serikat",
            lineHeight = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Type", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(
            title = "Multinational company",
            lineHeight = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Since", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(
            title = "1998",
            lineHeight = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Specialization", fontSize = 14.sp, lineHeight = 19.sp)
        Spacer(modifier = Modifier.height(5.dp))
        CustomHeading(
            title = "Search technology, Web computing, Software and Online advertising",
            lineHeight = 16.sp, textAlign = TextAlign.Start, modifier = Modifier.padding(end = 10.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTittle(title = "Company Gallery", fontSize = 14.sp, lineHeight = 19.sp)
    }
}