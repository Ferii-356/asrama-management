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
import com.example.asramamanagement.data.dummyInventories
import com.example.asramamanagement.model.Inventory

@Composable
fun InventoryScreen(
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
                text = "Inventaris Asrama",
                style = MaterialTheme.typography.headlineSmall
            )
        }


        // =========================
        // DATA INVENTARIS
        // =========================

        items(dummyInventories) { inventory ->

            InventoryCard(inventory)
        }
    }
}


// ==================================================
// INVENTORY CARD
// ==================================================

@Composable
fun InventoryCard(
    inventory: Inventory
) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp),

            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {

            Text(
                text = "📦 ${inventory.name}",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "Kategori: ${inventory.category}",
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = "Jumlah: ${inventory.quantity}",
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Kondisi: ${inventory.condition}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}