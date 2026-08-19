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
import com.example.asramamanagement.data.dummyReports
import com.example.asramamanagement.model.Report

@Composable
fun ReportScreen(
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
                text = "Laporan Asrama",
                style = MaterialTheme.typography.headlineSmall
            )

            Text(
                text = "Daftar laporan dan kondisi yang perlu diperhatikan",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 4.dp)
            )
        }


        // =========================
        // DATA LAPORAN
        // =========================

        items(dummyReports) { report ->

            ReportCard(report)
        }
    }
}


// ==================================================
// REPORT CARD
// ==================================================

@Composable
fun ReportCard(
    report: Report
) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp),

            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {

            Text(
                text = "🔧 ${report.title}",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = report.description,
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = "Kategori: ${report.category}",
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = "Status: ${report.status}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}