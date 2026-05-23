package com.lowkey.browser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                DashboardScreen()
            }
        }
    }
}

data class VirtualDevice(
    val name: String,
    val proxy: String,
    val status: String
)

@Composable
fun DashboardScreen() {

    val devices = listOf(
        VirtualDevice("Pixel 9", "1.1.1.1:8080", "ONLINE"),
        VirtualDevice("Samsung S24", "2.2.2.2:9090", "OFFLINE")
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {

        items(devices) { device ->

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
            ) {

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = device.name)
                    Text(text = "Proxy: ${device.proxy}")
                    Text(text = "Status: ${device.status}")
                }
            }
        }
    }
}
