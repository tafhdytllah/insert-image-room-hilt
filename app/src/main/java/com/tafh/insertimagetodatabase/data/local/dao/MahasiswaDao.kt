package com.tafh.insertimagetodatabase.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tafh.insertimagetodatabase.data.local.entity.Mahasiswa

@Dao
interface MahasiswaDao {

    @Query("SELECT * FROM mahasiswa_table ORDER BY id ASC")
    fun getAllMahasiswa(): LiveData<List<Mahasiswa>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

}