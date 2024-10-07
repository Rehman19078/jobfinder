package com.example.jobfinder.app.presentation.applyjob.Home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jobfinder.R
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomImage
import com.example.jobfinder.app.component.commoncomponent.CustomJobCard
import com.example.jobfinder.app.component.commoncomponent.CustomTittle
import com.example.jobfinder.app.component.commoncomponent.FontStyle
import com.example.jobfinder.app.component.commoncomponent.IconCard
import com.example.jobfinder.app.component.commoncomponent.SearchField
import com.example.jobfinder.app.presentation.Routes

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFFFFFFFF),
                contentColor = Color.White,
                modifier = Modifier.height(72.dp),
                content = {

                    CustomImage(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = "Home",
                        modifier = Modifier.padding(start = 30.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    CustomImage(
                        painter = painterResource(id = R.drawable.connection),
                        contentDescription = "Connection"
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Box(
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .background(Color(0xFF7551FF))
                            .height(36.dp)
                            .width(36.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Add,
                                contentDescription = "Add",
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    CustomImage(
                        painter = painterResource(id = R.drawable.chat),
                        contentDescription = "chat"
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    CustomImage(
                        painter = painterResource(id = R.drawable.save),
                        contentDescription = "save",
                        modifier = Modifier.padding(end = 23.dp)
                    )
                }
            )
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(210.dp)
                        .clip(shape = RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp))

                ) {
                    CustomImage(
                        painter = painterResource(id = R.drawable.topbar),
                        contentDescription = "topbar"
                    )
                    Column(modifier = Modifier.padding(start = 22.dp, end = 20.dp, top = 18.dp)) {
                        Row(
                            Modifier
                                .fillMaxWidth(),

                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            CustomImage(
                                painter = painterResource(id = R.drawable.notificattionicon),
                                contentDescription = "notification"
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                CustomHeading(
                                    title = "Hi, Rehman",
                                    fontSize = 14.sp,
                                    font = FontStyle.BOLD,
                                    color = Color(0xFFFFFFFF)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                CustomImage(
                                    painter = painterResource(id = R.drawable.profile),
                                    contentDescription = "profile"
                                )

                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        CustomTittle(
                            title = "Find the job you've always dreamed of",
                            textAlign = TextAlign.Start,
                            lineHeight = 27.sp,
                            fontSize = 20.sp,
                            color = Color(0xFFFFFFFF)
                        )
                        //serchfield
                        Spacer(modifier = Modifier.height(16.dp))
                        Row {
                            SearchField()
                            Spacer(modifier = Modifier.width(15.dp))
                            Box(
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(shape = RoundedCornerShape(12.dp))
                                    .background(Color(0xFFFF9228)),
                                contentAlignment = Alignment.Center

                            ) {
                                CustomImage(
                                    painter = painterResource(id = R.drawable.filtericon),
                                    contentDescription = "filter"
                                )
                            }
                        }

                    }
                }
                Spacer(modifier = Modifier.height(22.dp))
            }
//            item {
//                Box(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(210.dp)
//                        .clip(shape = RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp))
//
//                ) {
//                    CustomImage(
//                        painter = painterResource(id = R.drawable.topbar),
//                        contentDescription = "topbar"
//                    )
//                    Column(modifier = Modifier.padding(start = 22.dp, end = 20.dp, top = 18.dp)) {
//                        Row(
//                            Modifier
//                                .fillMaxWidth(),
//
//                            verticalAlignment = Alignment.CenterVertically
//                        ) {
//                            CustomImage(
//                                painter = painterResource(id = R.drawable.notificattionicon),
//                                contentDescription = "notification"
//                            )
//                            Spacer(modifier = Modifier.weight(1f))
//                            Row(verticalAlignment = Alignment.CenterVertically) {
//                                CustomHeading(
//                                    title = "Hi, Rehman",
//                                    fontSize = 14.sp,
//                                    font = FontStyle.BOLD,
//                                    color = Color(0xFFFFFFFF)
//                                )
//                                Spacer(modifier = Modifier.width(10.dp))
//                                CustomImage(
//                                    painter = painterResource(id = R.drawable.profile),
//                                    contentDescription = "profile"
//                                )
//
//                            }
//                        }
//                        Spacer(modifier = Modifier.height(20.dp))
//                        CustomTittle(
//                            title = "Find the job you've always dreamed of",
//                            textAlign = TextAlign.Start,
//                            lineHeight = 27.sp,
//                            fontSize = 20.sp,
//                            color = Color(0xFFFFFFFF)
//                        )
//                        //serchfield
//                        Spacer(modifier = Modifier.height(16.dp))
//                        Row {
//                            SearchField()
//                            Spacer(modifier = Modifier.width(15.dp))
//                            Box(
//                                modifier = Modifier
//                                    .size(50.dp)
//                                    .clip(shape = RoundedCornerShape(12.dp))
//                                    .background(Color(0xFFFF9228)),
//                                contentAlignment = Alignment.Center
//
//                            ) {
//                                CustomImage(
//                                    painter = painterResource(id = R.drawable.filtericon),
//                                    contentDescription = "filter"
//                                )
//                            }
//                        }
//
//                    }
//                }
//                Spacer(modifier = Modifier.height(22.dp))
//            }
            item {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp)
                ) {
                    CustomTittle(title = "Specialization", fontSize = 16.sp)
                    CustomHeading(title = "View all", color = Color(0xFFAAA6B9))
                }
                Spacer(modifier = Modifier.height(12.dp))
            }
            item {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconCard(
                        cardicon = R.drawable.designicon,
                        title = "Design",
                        description = "20 Jobs"
                    )

                    IconCard(
                        cardicon = R.drawable.financeicon,
                        title = "Finance",
                        description = "40 Jobs"
                    )
                    IconCard(
                        cardicon = R.drawable.educationicon,
                        title = "Education",
                        description = "70 Jobs"
                    )
                }
                Spacer(modifier = Modifier.height(9.dp))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconCard(
                        cardicon = R.drawable.resturenticon,
                        title = "Resturent",
                        description = "90 Jobs"
                    )

                    IconCard(
                        cardicon = R.drawable.healthicon,
                        title = "Health",
                        description = "120 Jobs"
                    )
                    IconCard(
                        cardicon = R.drawable.programicon,
                        title = "Programmer",
                        description = "140 Jobs"
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
            }
            item {
                CustomTittle(
                    title = "Job Recommendation",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                )
                Spacer(modifier = Modifier.height(7.dp))
            }
            items(200) { index ->
                CustomJobCard(
                    jobTitle = "UI/UX Designer",
                    companyInfo = "Google Inc. California, USA",
                    salary = "$15K/Mo",
                    jobTags = listOf("Design", "Full time", "Designer"),
                    onTagClick = { tag ->
                    },
                    modifier = Modifier.clickable {
                        navController.navigate(Routes.JobDetailScreen.name)
                    }

                )
                Spacer(modifier = Modifier.height(16.dp))
            }

        }

    }
}










