package com.example.asramamanagement

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
import com.example.asramamanagement.data.dummyRooms
import com.example.asramamanagement.model.Room

@Composable
fun RoomScreen(
    onBack: () -> Unit
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        // =========================
        // HEADER
        // =========================

        item {

            Text(
                text = "← Kembali",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Text(
                text = "Daftar Kamar",
                style = MaterialTheme.typography.headlineSmall
            )
        }


        // =========================
        // DATA KAMAR
        // =========================

        items(dummyRooms) { room ->

            RoomCard(room)
        }
    }
}


// ==================================================
// ROOM CARD
// ==================================================

@Composable
fun RoomCard(
    room: Room
) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp),

            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {

            Text(
                text = "🏠 ${room.name}",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "${room.occupants} / ${room.capacity} penghuni",
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Kondisi: ${room.condition}",
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = if (room.occupants >= room.capacity) {
                    "Status: Penuh"
                } else {
                    "Status: Tersedia ${room.capacity - room.occupants} tempat"
                },
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}