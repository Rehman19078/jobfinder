package com.example.jobfinder.app.presentation.applyjob.upload

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jobfinder.R
import com.example.jobfinder.app.component.commoncomponent.CustomButton
import com.example.jobfinder.app.component.commoncomponent.CustomHeading
import com.example.jobfinder.app.component.commoncomponent.CustomImage
import com.example.jobfinder.app.component.commoncomponent.CustomTittle
import com.example.jobfinder.app.component.commoncomponent.JobTopBox

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UploadCV(navController: NavController) {
    var infotext by remember { mutableStateOf("") }
    Scaffold { paddingvalues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingvalues)
                .background(Color(0xFFFFFFFF))
        ) {
            JobTopBox(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "google",
                title = "UI/UX Designer",
                companyinfo = "Google inc . California, USA . $15K/Mo",
                jobTags = listOf("Design", "Full time", "Designer"),
                onTagClick = { tag ->
                })
            Spacer(modifier = Modifier.height(30.dp))
            Box(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .fillMaxSize()
            ) {
                Column(Modifier.fillMaxSize()) {
                    CustomTittle(title = "Upload CV", fontSize = 14.sp, lineHeight = 19.sp)
                    Spacer(modifier = Modifier.height(10.dp))
                    CustomHeading(
                        title = "Add your CV/Resume to apply for a job",
                        lineHeight = 16.sp
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    CustomImage(
                        painter = painterResource(id = R.drawable.resume),
                        contentDescription = "resume",
                        modifier = Modifier
                            .height(78.dp)
                            .width(338.dp)
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    CustomTittle(title = "Information", fontSize = 14.sp, lineHeight = 19.sp)
                    Spacer(modifier = Modifier.height(15.dp))
                    TextField(
                        value = infotext,
                        onValueChange = { infotext = it },
                        placeholder = {
                            CustomHeading(title = "Explain why you are the right person for this job", modifier = Modifier.padding(20.dp), textAlign = TextAlign.Start, lineHeight = 16.sp)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(232.dp)
                            .shadow(4.dp, RoundedCornerShape(20.dp))
                            .background(Color(0xFFF0F0F0), RoundedCornerShape(20.dp)),
                        maxLines = 10,
                        singleLine = false,
                        keyboardOptions = KeyboardOptions(
                            capitalization = KeyboardCapitalization.Sentences,
                            imeAction = ImeAction.Default
                        ),
                        visualTransformation = VisualTransformation.None,
                        textStyle = TextStyle(color = Color(0xFFAAA6B9), fontSize = 14.sp), // Text styling
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFFFFFFF),
                            unfocusedIndicatorColor = Color.Transparent,  
                            focusedIndicatorColor = Color.Transparent, 
                        )
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    CustomButton(text = "Apply Now", onClick = { /*TODO*/ }, modifier = Modifier.padding(bottom = 10.dp))

                }
            }

        }
    }
}