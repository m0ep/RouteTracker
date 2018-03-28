package de.florianm.android.routetracker.db.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
import org.threeten.bp.Duration
import org.threeten.bp.OffsetDateTime

@Entity(tableName = "RouteSegment",
        foreignKeys = [(ForeignKey(
                entity = RouteSegment::class,
                parentColumns = ["id"],
                childColumns = ["next_track_id"],
                onDelete = ForeignKey.CASCADE))]
)
data class RouteSegment(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long,
        @ColumnInfo(name = "created_at") val createdAt: OffsetDateTime,
        @ColumnInfo(name = "next_track_id") val nextTrackId: Long,
        @ColumnInfo(name = "update_distance") val updateDistance: Float?,
        @ColumnInfo(name = "update_interval") val updateInterval: Long = Duration.ofSeconds(30).toMillis(),
        @ColumnInfo(name = "total_track_distance") val totalTrackDistance: Double = 0.0)