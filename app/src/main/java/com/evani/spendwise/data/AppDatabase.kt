package com.evani.spendwise.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Expense::class,Account::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract val expenseDao: ExpenseDao
    abstract val accountDao: AccountDao
}