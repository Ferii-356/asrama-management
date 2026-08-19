package com.example.asramamanagement.model

data class Inventory(
    val id: Int,
    val name: String,
    val category: String,
    val quantity: Int,
    val condition: String
)