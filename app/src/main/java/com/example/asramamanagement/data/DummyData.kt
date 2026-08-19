package com.example.asramamanagement.data

import com.example.asramamanagement.model.Room
import com.example.asramamanagement.model.Student
import com.example.asramamanagement.model.Inventory
import com.example.asramamanagement.model.Report

val dummyStudents = listOf(
    Student(
        id = 1,
        name = "Budi Santoso",
        studentNumber = "231001",
        room = "Kamar 03",
        status = "Aktif"
    ),
    Student(
        id = 2,
        name = "Andi Saputra",
        studentNumber = "231002",
        room = "Kamar 01",
        status = "Aktif"
    ),
    Student(
        id = 3,
        name = "Fajar Ramadhan",
        studentNumber = "231003",
        room = "Kamar 05",
        status = "Pulang"
    ),
    Student(
        id = 4,
        name = "Rizky Maulana",
        studentNumber = "231004",
        room = "Kamar 02",
        status = "Aktif"
    ),
    Student(
        id = 5,
        name = "Dimas Pratama",
        studentNumber = "231005",
        room = "Kamar 04",
        status = "Izin"
    )
)

val dummyRooms = listOf(
    Room(
         id = 1,
        name = "Kamar 01",
        capacity = 8,
        occupants = 8,
        condition = "Baik"
    ),

    Room(
        id = 2,
        name = "Kamar 02",
        capacity = 8,
        occupants = 6,
        condition = "Baik"
    ),

    Room(
        id = 3,
        name = "Kamar 03",
        capacity = 8,
        occupants = 7,
        condition = "Perlu Perhatian"
    ),

    Room(
        id = 4,
        name = "Kamar 04",
        capacity = 8,
        occupants = 5,
        condition = "Baik"
    ),

    Room(
        id = 5,
        name = "Kamar 05",
        capacity = 8,
        occupants = 8,
        condition = "Perlu Perhatian"
    ),

    Room(
        id = 6,
        name = "Kamar 06",
        capacity = 8,
        occupants = 4,
        condition = "Baik"
    )
)

val dummyInventories = listOf(

    Inventory(
        id = 1,
        name = "Kasur",
        category = "Kamar",
        quantity = 20,
        condition = "Baik"
    ),

    Inventory(
        id = 2,
        name = "Bantal",
        category = "Kamar",
        quantity = 25,
        condition = "Baik"
    ),

    Inventory(
        id = 3,
        name = "Lemari",
        category = "Kamar",
        quantity = 12,
        condition = "Baik"
    ),

    Inventory(
        id = 4,
        name = "Kipas Angin",
        category = "Elektronik",
        quantity = 10,
        condition = "2 Rusak"
    ),

    Inventory(
        id = 5,
        name = "Meja Belajar",
        category = "Fasilitas",
        quantity = 15,
        condition = "1 Rusak"
    ),

    Inventory(
        id = 6,
        name = "Kursi",
        category = "Fasilitas",
        quantity = 20,
        condition = "Baik"
    ),

    Inventory(
        id = 7,
        name = "Lampu",
        category = "Elektronik",
        quantity = 18,
        condition = "2 Rusak"
    )
)

val dummyReports = listOf(

    Report(
        id = 1,
        title = "Kipas Kamar 03 Rusak",
        description = "Kipas tidak dapat menyala.",
        category = "Fasilitas",
        status = "Belum Selesai"
    ),

    Report(
        id = 2,
        title = "Lampu Kamar 05 Mati",
        description = "Lampu utama kamar perlu diganti.",
        category = "Fasilitas",
        status = "Diproses"
    ),

    Report(
        id = 3,
        title = "Kebersihan Kamar 02",
        description = "Perlu pengecekan kebersihan kamar.",
        category = "Kebersihan",
        status = "Selesai"
    ),

    Report(
        id = 4,
        title = "Keran Air Rusak",
        description = "Keran kamar mandi mengalami kebocoran.",
        category = "Fasilitas",
        status = "Belum Selesai"
    )
)