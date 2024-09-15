package com.example.cognifyzproject


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.style.TextAlign

data class Person3(
    val name: String,
    val year: String,
    val email: String,
    val mobile: String,
    val website: String,
    val workAddress: String
)

@Composable
fun Task7(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val sampleData = listOf(
        Person3(
            "Alice Johnson",
            "20 years old",
            "alice.johnson@example.com",
            "+1234567890",
            "www.alicejohnson.com",
            "123 Alice Lane, Wonderland"
        ),
        Person3(
            "Bob Smith",
            "23 years old",
            "bob.smith@example.com",
            "+1234567891",
            "www.bobsmith.com",
            "456 Bob Street, Metropolis"
        ),
        Person3(
            "Ajay Sharma",
            "32 years old",
            "ajay.sharma@example.com",
            "+ 91 98765 43210",
            "ajaysharma.com",
            "123 A, Golden Apartment, New Delhi, India"
        ),
        Person3(
            "Ajay Sharma",
            "32 years old",
            "ajay.sharma@example.com",
            "+91 98765 43210",
            "ajaysharma.com",
            "123 A, Golden Apartment, New Delhi, India"
        ),

        Person3(
            "Seema Agrawal",
            "28 years old",
            "seema.agrawal@example.com",
            "+91 98765 12345",
            "seemaagrawal.com",
            "45/12, Om Nagar, Mumbai, India"
        ),

        Person3(
            "Amit Kumar",
            "40 years old",
            "amit.kumar@example.com",
            "+91 87654 32109",
            "amitkumar.com",
            "67, City Center, Kolkata, India"
        ),

        Person3(
            "Priyanka Yadav",
            "25 years old",
            "priyanka.yadav@example.com",
            "+91 87654 98765",
            "priyankayadav.com",
            "89/3, Green Garden, Bengaluru, India"
        ),

        Person3(
            "Rajesh Verma",
            "35 years old",
            "rajesh.verma@example.com",
            "+91 98765 67890",
            "rajeshverma.com",
            "21, Pearl Heights, Hyderabad, India"
        ),

        Person3(
            "Neelam Singh",
            "30 years old",
            "neelam.singh@example.com",
            "+91 91234 56789",
            "neelamsingh.com",
            "54, New Colony, Jaipur, India"
        ),

        Person3(
            "Sanjay Rawat",
            "38 years old",
            "sanjay.rawat@example.com",
            "+91 92345 67890",
            "sanjayrawat.com",
            "32, Link Road, Chandigarh, India"
        ),

        Person3(
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
                text = "Task 7: Basic Database Usages",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color(0xFFFF8225)
                )
            )
        }


        LazyColumn(
            contentPadding = PaddingValues(horizontal = 10.dp)
        ) {
            item {
                Text(
                    text = "\"Users data is fetched from local storage using room database and displayed using List.\"",
                    modifier = Modifier.padding(10.dp),
                    color = Color.Black,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
            }
            items(sampleData) { person ->
                ListItemView3(person)

            }

        }
    }
}

@Composable
fun ListItemView3(person: Person3) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.dp)
            .background(color = Color.Transparent)
            .border(2.dp, shape = RoundedCornerShape(10.dp), color = Color(0xFFFFA663))
            .padding(7.dp),
        verticalArrangement = Arrangement.Center
    ) {

        InfosRows(iconResId = R.drawable.website, value = person.name)
        InfosRows(iconResId = R.drawable.baseline_person_outline_24, value = person.year)
        InfosRows(iconResId = R.drawable.baseline_mail_outline_24, value = person.email)
        InfosRows(iconResId = R.drawable.call, value = person.mobile)
        InfosRows(iconResId = R.drawable.browser, value = person.website)
        InfosRows(iconResId = R.drawable.home, value = person.workAddress)
    }
}

@Composable
fun InfosRows(iconResId: Int, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 4.dp), verticalAlignment = Alignment.CenterVertically
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