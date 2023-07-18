package com.evani.spendwise.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpenseDao {
    @Query("SELECT * FROM expense")
    suspend fun getAllExpenses() : List<Expense>

    @Upsert
    suspend fun insertExpense(vararg expense: Expense)

    @Delete
    suspend fun deleteExpense(vararg expense: Expense)

    @Query("SELECT * FROM expense WHERE id = :expenseId")
    suspend fun getExpenseById(expenseId: Long): Expense

    @Query("SELECT * FROM expense WHERE account_id = :accountId ORDER BY date DESC")
    suspend fun getExpensesByAccountId(accountId: Long): Flow<List<Expense>>
}