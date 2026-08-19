package com.example.asramamanagement

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.asramamanagement.data.dummyStudents
import com.example.asramamanagement.model.Student

@Composable
fun StudentScreen(
    onBack: () -> Unit
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        item {

            Text(
                text = "← Kembali",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.clickable {
                    onBack()
                }
            )

            Text(
                text = "Daftar Santri",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(top = 12.dp)
            )
        }

        items(dummyStudents) { student ->
            StudentCard(student)
        }
    }
}

@Composable
fun StudentCard(
    student: Student
) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {

            Text(
                text = student.name,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = "NIM: ${student.studentNumber}"
            )

            Text(
                text = "Kamar: ${student.room}"
            )

            Text(
                text = "Status: ${student.status}"
            )
        }
    }
}