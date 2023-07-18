package com.evani.spendwise.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "expense" ,
    foreignKeys = [
        ForeignKey(entity = Account::class, parentColumns = ["id"],
        childColumns = ["accountId"], onDelete = ForeignKey.CASCADE)
    ])

data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo("account_type")
    val account_type : String?,
    @ColumnInfo("expense_category")
    val expense_category: String?,
    @ColumnInfo("date")
    val date: Date,
    @ColumnInfo("amount")
    val amount: Double?,
    @ColumnInfo("currancy")
    val currency: String?,
    @ColumnInfo("account_id")
    val accountId: Long,
    @ColumnInfo("account_type")
    val accountType: String,
    @ColumnInfo("notes")
    val notes: String?
)
