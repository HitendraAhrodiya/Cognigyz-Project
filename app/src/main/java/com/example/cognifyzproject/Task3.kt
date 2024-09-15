package com.example.cognifyzproject

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

data class Person(
    val name: String,
    val year: String,
    val email: String,
    val mobile: String,
    val website: String,
    val workAddress: String

)

@Composable
fun Task3(
    modifier: Modifier = Modifier, navController: NavController
) {
    val sampleData = listOf(
        Person(
            "Alice Johnson",
            "20 years old",
            "alice.johnson@example.com",
            "+1234567890",
            "www.alicejohnson.com",
            "123 Alice Lane, Wonderland"
        ),
        Person(
            "Bob Smith",
            "23 years old",
            "bob.smith@example.com",
            "+1234567891",
            "www.bobsmith.com",
            "456 Bob Street, Metropolis"
        ),
        Person(
            "Ajay Sharma",
            "32 years old",
            "ajay.sharma@example.com",
            "+ 91 98765 43210",
            "ajaysharma.com",
            "123 A, Golden Apartment, New Delhi, India"
        ),
        Person(
            "Ajay Sharma",
            "32 years old",
            "ajay.sharma@example.com",
            "+91 98765 43210",
            "ajaysharma.com",
            "123 A, Golden Apartment, New Delhi, India"
        ),

        Person(
            "Seema Agrawal",
            "28 years old",
            "seema.agrawal@example.com",
            "+91 98765 12345",
            "seemaagrawal.com",
            "45/12, Om Nagar, Mumbai, India"
        ),

        Person(
            "Amit Kumar",
            "40 years old",
            "amit.kumar@example.com",
            "+91 87654 32109",
            "amitkumar.com",
            "67, City Center, Kolkata, India"
        ),

        Person(
            "Priyanka Yadav",
            "25 years old",
            "priyanka.yadav@example.com",
            "+91 87654 98765",
            "priyankayadav.com",
            "89/3, Green Garden, Bengaluru, India"
        ),

        Person(
            "Rajesh Verma",
            "35 years old",
            "rajesh.verma@example.com",
            "+91 98765 67890",
            "rajeshverma.com",
            "21, Pearl Heights, Hyderabad, India"
        ),

        Person(
            "Neelam Singh",
            "30 years old",
            "neelam.singh@example.com",
            "+91 91234 56789",
            "neelamsingh.com",
            "54, New Colony, Jaipur, India"
        ),

        Person(
            "Sanjay Rawat",
            "38 years old",
            "sanjay.rawat@example.com",
            "+91 92345 67890",
            "sanjayrawat.com",
            "32, Link Road, Chandigarh, India"
        ),

        Person(
            "Riya Sharma",
            "27 years old",
            "riya.sharma@example.com",
            "+91 93456 78901",
            "riyasharma.com",
            "78/2, Royal Enclave, Pune, India"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFC9DABF))
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
                text = "Task 3: List Display",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color(0xFFFF8225)
                )
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        // List of items
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 10.dp)
        ) {
            items(sampleData) { person ->
                ListItemView(person)
            }
        }
    }
}

@Composable
fun ListItemView(person: Person) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp)
            .background(color = Color.Transparent)
            .border(2.dp, shape = RoundedCornerShape(10.dp), color = Color(0xFFFFA663))
            .padding(7.dp),
        verticalArrangement = Arrangement.Center
    ) {

        InfoRow(iconResId = R.drawable.website, value = person.name)
        InfoRow(iconResId = R.drawable.baseline_person_outline_24, value = person.year)
        InfoRow(iconResId = R.drawable.baseline_mail_outline_24, value = person.email)
        InfoRow(iconResId = R.drawable.call, value = person.mobile)
        InfoRow(iconResId = R.drawable.browser, value = person.website)
        InfoRow(iconResId = R.drawable.home, value = person.workAddress)
    }
}

@Composable
fun InfoRow(iconResId: Int, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = "icon",
            modifier = Modifier
                .padding(end = 8.dp)
                .size(24.dp),
            tint = Color(0xFFFF8225)
        )
        Text(text = " $value", color = Color.Black)
    }
}
