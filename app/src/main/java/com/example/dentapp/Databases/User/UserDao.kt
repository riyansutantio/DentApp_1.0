package com.example.dentapp.Databases.User

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM user ORDER BY id_user ASC")
    fun readAllData(): LiveData<List<User>>

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)
/* delete all user
    @Query("DELETE FROM user")
    suspend fun deleteAllUser()*/
}
