package com.example.cognifyzproject

import android.R.id.content
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomePage(navController: NavController, modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC9DABF))
            .padding(top = 80.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                navController.navigate("task1")
            },
            modifier = Modifier.size(width = 300.dp, height = 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 1: Hello World App",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("task2")
            },
            modifier = Modifier.size(width = 320.dp, height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 2: Button Interaction",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("task3")
            },
            modifier = Modifier.size(width = 320.dp, height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 3: List Display",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("task4")
            },
            modifier = Modifier.size(width = 320.dp, height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 4: Basic UI Layout",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("task5")
            },
            modifier = Modifier.size(width = 320.dp, height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 5: Fetch and Display Data",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("task6")
            },
            modifier = Modifier.size(width = 320.dp, height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 6: Simple Form",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("task7")
            },
            modifier = Modifier.size(width = 320.dp, height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 7: Basic Database Usage",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("task8")
            },
            modifier = Modifier.size(width = 320.dp, height = 55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8225))
        ) {
            Text(
                text = "Task 8: Implement Navigation",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.White
                )
            )
        }
    }
}