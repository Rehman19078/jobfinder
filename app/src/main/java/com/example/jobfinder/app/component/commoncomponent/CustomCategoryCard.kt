package com.example.jobfinder.app.component.commoncomponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun IconCard(
    cardicon: Int,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(25.dp),
        modifier = modifier
            .height(112.dp)
            .width(104.dp),
        colors = androidx.compose.material3.CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        )
    ) {

            Column(
                modifier = Modifier.fillMaxSize().padding(top = 14.dp, bottom = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CustomImage(painter = painterResource(id = cardicon), contentDescription =null,)
                CustomTittle(title = title, fontSize = 12.sp)
                CustomHeading(title = description,)
            }
        }
    }

