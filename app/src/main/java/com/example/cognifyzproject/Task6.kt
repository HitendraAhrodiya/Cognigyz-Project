package com.example.cognifyzproject

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Task6(modifier: Modifier = Modifier, navController: NavController) {

    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }
    var query by remember {
        mutableStateOf("")
    }
var successMessage by remember {
    mutableStateOf<String?>(null)
}
    LaunchedEffect(successMessage) {
        if (successMessage != null){
            delay(5000)
            successMessage = null
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFC9DABF)),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .padding(top = 40.dp)
                .border(1.dp, color = Color.Black)
                .fillMaxWidth()
                .height(60.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "Task 6: Simple Form",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color(0xFFFF8225)
                )
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Have some Query? Tell us!",
            color = Color(0xFFFF8225),
            fontSize = 24.sp,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = name, onValueChange = { name = it },
            label = { Text(text = "Your Name") },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedIndicatorColor = Color(0xFFFF8225),
                unfocusedIndicatorColor = Color(0xFF8B6E59),
                cursorColor = Color(0xFFFF8225),
                focusedLabelColor = Color(0xFF8B6E59),
                unfocusedLabelColor = Color(0xFF8B6E59)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Email Address") },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedIndicatorColor = Color(0xFFFF8225),
                unfocusedIndicatorColor = Color(0xFF8B6E59),
                cursorColor = Color(0xFFFF8225),
                focusedLabelColor = Color(0xFF8B6E59),
                unfocusedLabelColor = Color(0xFF8B6E59)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = phone, onValueChange = { phone = it },
            label = { Text(text = "Phone Number") },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedIndicatorColor = Color(0xFFFF8225),
                unfocusedIndicatorColor = Color(0xFF8B6E59),
                cursorColor = Color(0xFFFF8225),
                focusedLabelColor = Color(0xFF8B6E59),
                unfocusedLabelColor = Color(0xFF8B6E59)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = query, onValueChange = { query = it },
            label = { Text(text = "Query") },
            placeholder = { Text(text = "Explain your query here", color = Color(0xFF8B6E59)) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedIndicatorColor = Color(0xFFFF8225),
                unfocusedIndicatorColor = Color(0xFF8B6E59),
                cursorColor = Color(0xFFFF8225),
                focusedLabelColor = Color(0xFF8B6E59),
                unfocusedLabelColor = Color(0xFF8B6E59)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(start = 20.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 23.dp)) {
            successMessage?.let {
                Text(text = it, color = Color.Red, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                name = ""
                email = ""
                phone = ""
                query = ""
                successMessage = "Query send successfully!"
            },

            modifier = Modifier
                .width(150.dp)
                .height(50.dp), shape = RoundedCornerShape(20),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFF8225),
            )
        ) {
            Text(text = "Send Query", color = Color.Black, fontSize = 18.sp)
        }
    }
}
