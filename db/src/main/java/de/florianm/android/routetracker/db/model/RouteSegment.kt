package de.florianm.android.routetracker.db.model

import android.arch.persistence.room.*
import org.threeten.bp.OffsetDateTime

@Entity(tableName = "RouteSegment",
        indices = [(Index(
                value = ["route_id"],
                name = "idx_segment_route_id"))],
        foreignKeys = [(ForeignKey(
                entity = Route::class,
                parentColumns = ["id"],
                childColumns = ["route_id"],
                onDelete = ForeignKey.CASCADE))]
)
data class RouteSegment(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long,
        @ColumnInfo(name = "created_at") val createdAt: OffsetDateTime = OffsetDateTime.now(),
        @ColumnInfo(name = "route_id") val routeId: Long,
        @ColumnInfo(name = "total_distance") val totalDistance: Double = 0.0,
        @ColumnInfo(name = "jsonData") val jsonData: String = "{}")