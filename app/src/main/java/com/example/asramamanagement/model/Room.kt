package com.example.asramamanagement.model

data class Room(
    val id: Int,
    val name: String,
    val capacity: Int,
    val occupants: Int,
    val condition: String
)