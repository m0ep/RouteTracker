package de.florianm.android.routetracker.db.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "RoutePoint")
data class RoutePoint(
        @PrimaryKey(autoGenerate = true) val id: Long,
        @ColumnInfo val lat: Double,
        @ColumnInfo val lon: Double,
        @ColumnInfo val accuracy: Float,
        @ColumnInfo val altitude: Double,
        @ColumnInfo val bearing: Float,
        @ColumnInfo val speed: Float,
        @ColumnInfo val provider: String,
        @ColumnInfo val time: Long)