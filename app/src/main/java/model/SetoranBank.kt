package model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SetoranBank(
    @PrimaryKey val id: String,
    val tanggal: String,
    val rekening: String,
    val nama: String,
    val nominal: String
)
