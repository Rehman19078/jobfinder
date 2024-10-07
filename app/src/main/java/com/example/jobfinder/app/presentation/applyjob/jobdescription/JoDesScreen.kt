package com.example.jobfinder.app.presentation.applyjob.jobdescription

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jobfinder.R
import com.example.jobfinder.app.component.commoncomponent.CustomButton
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomImage
import com.example.jobfinder.app.component.commoncomponent.JobTopBox
import com.example.jobfinder.app.presentation.Routes
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun JobDetailScreen(navController: NavController) {
    val state = rememberPagerState {
        2
    }
    val tablist = listOf(
        "Description",
        "Company"
    )
    val scope = rememberCoroutineScope()
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFFFFFFFF),
                contentColor = Color.White,
                modifier = Modifier
                    .height(78.dp)
                    .padding(top = 6.dp),
                content = {

                    CustomImage(
                        painter = painterResource(id = R.drawable.saveorange),
                        contentDescription = "save",
                        modifier = Modifier.padding(start = 37.dp)
                    )
                    Spacer(modifier = Modifier.width(28.dp))
                    CustomButton(
                        text = "Apply Now",
                        onClick = {
                            navController.navigate(Routes.UploadScreen.name)
                        },
                        modifier = Modifier.padding(end = 20.dp),
                        cornerRadius = 18.dp
                    )

                }
            )
        }
    ) { innerpadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerpadding)
                .background(Color.White)
        ) {
            JobTopBox(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "google",
                title = "UI/UX Designer",
                companyinfo = "Google inc . California, USA . $15K/Mo",
                jobTags = listOf("Design", "Full time", "Designer"),
                onTagClick = { tag ->
                })
            Spacer(modifier = Modifier.height(25.dp))
            TabRow(selectedTabIndex = state.currentPage,
                containerColor = Color.White,
                indicator = {
                    Color.White
                },
                divider = {null}
                ) {

                tablist.forEachIndexed { index, title ->
                    Tab(
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
                            .height(40.dp)
                            .width(162.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(
                                if (state.currentPage == index) Color(0xFFFFA500)
                                else Color.White
                            ),
                        selected = state.currentPage == index,
                        onClick = {
                            scope.launch {
                                state.animateScrollToPage(index)
                            }
                        },
                        text = {

                            CustomHeading(
                                title = title, fontSize = 14.sp,
                                color = if (state.currentPage == index) Color.White else Color.Black
                            )
                        })
                }
            }
         Spacer(modifier = Modifier.height(13.dp))
            HorizontalPager(state = state) { pages ->
                when (pages) {
                    0 -> TabScreen1()
                    1 -> TabScreen2()
                }

            }

        }
    }
}