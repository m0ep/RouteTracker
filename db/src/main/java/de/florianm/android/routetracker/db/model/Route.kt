package de.florianm.android.routetracker.db.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import org.threeten.bp.OffsetDateTime

@Entity(tableName = "Route")
data class Route(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long,
        @ColumnInfo(name = "created_at") val createdAt: OffsetDateTime = OffsetDateTime.now(),
        @ColumnInfo(name = "name") val name: String,
        @ColumnInfo(name = "total_distance") val totalDistance: Double = 0.0)