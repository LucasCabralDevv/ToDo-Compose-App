package com.lucascabral.todocomposeapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lucascabral.todocomposeapp.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}