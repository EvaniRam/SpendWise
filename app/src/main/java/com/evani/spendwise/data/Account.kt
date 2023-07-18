package com.evani.spendwise.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts")
data class Account(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val type: String,
    val balance: Double
)
