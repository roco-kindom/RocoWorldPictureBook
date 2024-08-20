package com.lanier.rocoworld.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lanier.rocoworld.database.Constant

@Entity(tableName = Constant.TN_PROPERTY)
data class Property(
    @PrimaryKey val id: String,
    @ColumnInfo val name: String,
)
