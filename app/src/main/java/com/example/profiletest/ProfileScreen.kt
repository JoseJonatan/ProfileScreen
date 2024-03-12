package com.example.profiletest

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class UserProfile(
    val name: String,
    val birth: String,
    val email: String,
    val tel: String,
    val insta: String,
    val pass: String,
    val profileImageRes: Int)

@Composable
fun ProfileScreen(userProfile: UserProfile) {
    CircleBox(modifier = Modifier.fillMaxSize()){
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "back", tint = Color.White,
            modifier = Modifier.padding(start = 5.dp, top = 5.dp)
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(10.dp)
        ) {
            Text(text = userProfile.name, color = Color.White, fontSize = 25.sp)
            // Profile Image
            Image(
                painter = painterResource(id = userProfile.profileImageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Box(Modifier.padding(horizontal = 8.dp).fillMaxWidth()
            ) {
                Row(modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(16.dp)) {
                    Icon(imageVector = Icons.Default.Person, contentDescription = "user", tint = Color.Blue)
                    Spacer(Modifier.size(15.dp))
                    Text(text = userProfile.name, color = Color.Blue)
                }
            }
            Divider(
                modifier = Modifier.padding(start = 2.dp, end = 2.dp),
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            Box(Modifier.padding(horizontal = 8.dp).fillMaxWidth()
            ) {
                Row(modifier = Modifier.align(Alignment.CenterStart)
                    .padding(16.dp)) {
                    Icon(imageVector = Icons.Default.CalendarMonth, contentDescription = "birth", tint = Color.Blue)
                    Spacer(Modifier.size(15.dp))
                    Text(text = userProfile.birth, color = Color.Blue)
                }
            }
            Divider(
                modifier = Modifier.padding(start = 2.dp, end = 2.dp),
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            Box(Modifier.padding(horizontal = 8.dp).fillMaxWidth()
            ) {
                Row(modifier = Modifier.align(Alignment.CenterStart)
                    .padding(16.dp)) {
                    Icon(imageVector = Icons.Default.Smartphone, contentDescription = "tel", tint = Color.Blue)
                    Spacer(Modifier.size(15.dp))
                    Text(text = userProfile.tel, color = Color.Blue)
                }
            }
            Divider(
                modifier = Modifier.padding(start = 2.dp, end = 2.dp),
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            Box(Modifier.padding(horizontal = 8.dp).fillMaxWidth()
            ) {
                Row(modifier = Modifier.align(Alignment.CenterStart)
                    .padding(16.dp)) {
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = "insta", tint = Color.Blue)
                    Spacer(Modifier.size(15.dp))
                    Text(text = userProfile.insta, color = Color.Blue)
                }
            }
            Divider(
                modifier = Modifier.padding(start = 2.dp, end = 2.dp),
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            Box(Modifier.padding(horizontal = 8.dp).fillMaxWidth()
            ) {
                Row(modifier = Modifier.align(Alignment.CenterStart)
                    .padding(16.dp)) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "mail", tint = Color.Blue)
                    Spacer(Modifier.size(15.dp))
                    Text(text = userProfile.email, color = Color.Blue)
                }
            }
            Divider(
                modifier = Modifier.padding(start = 2.dp, end = 2.dp),
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            Box(Modifier.padding(horizontal = 8.dp).fillMaxWidth()
            ) {
                Row(modifier = Modifier.align(Alignment.CenterStart)
                    .padding(16.dp)) {
                    Icon(imageVector = Icons.Default.Visibility, contentDescription = "pass", tint = Color.Blue)
                    Spacer(Modifier.size(15.dp))
                    Text(text = userProfile.pass, color = Color.Blue)
                    Spacer(Modifier.size(15.dp))
                    Icon(imageVector = Icons.Default.Refresh, contentDescription = "pass", tint = Color.Blue)
                }
            }
            Divider(
                modifier = Modifier.padding(start = 2.dp, end = 2.dp),
                thickness = 1.dp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(26.dp))

            // Save Button
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.height(50.dp),
                //shape = RoundedCornerShape(75),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text("Edit Profile")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    val userProfile = UserProfile(
        name = "Jonatan Islas Austria",
        birth = "Birthday",
        tel = "7712022653",
        insta = "instagram account",
        email = "ing_jia@outlook.com",
        pass = "Password                                       ",
        profileImageRes = R.drawable.user// Replace with your actual image resource
    )
    ProfileScreen(userProfile = userProfile)
}

@Composable
private fun CircleBox(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Box(
        modifier = modifier
            .background(brush = Brush.horizontalGradient(
                colors = listOf(
                    Color.Blue,
                    Color.Magenta
                )
            ))
            .drawBehind {
            val width = size.width
            val height = size.height
            //drawRect(Color.Blue)

            scale(scaleX = 2f, scaleY = 1f) {
                drawOval(
                    Color.White,
                    topLeft = Offset(0f, height * .25f),
                    size = Size(width, height)
                )
            }
        }
    ) {
        content()
    }
}