package com.example.hw4.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hw4.remote.LoveModel

@Dao
interface LoveDao {

    @Insert
    fun insert(lioveModel: LoveModel)
/* ORDER BY fname ASC*/
    @Query ("SELECT * FROM `love-table` ORDER BY fname ASC")
    fun getAll(): List<LoveModel>
}