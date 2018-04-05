package de.florianm.android.routetracker.db.model

import android.arch.persistence.room.*
import org.threeten.bp.OffsetDateTime


@Entity(tableName = "RoutePoint",
        indices = [(Index(
                value = ["segment_id"],
                name = "idx_point_segment_id"))],
        foreignKeys = [(ForeignKey(
                entity = RouteSegment::class,
                parentColumns = ["id"],
                childColumns = ["segment_id"],
                onDelete = ForeignKey.CASCADE))]
)
data class RoutePoint(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long = 0L,
        @ColumnInfo(name = "created_at") val createdAt: OffsetDateTime = OffsetDateTime.now(),
        @ColumnInfo(name = "segment_id") val segmentId: Long,
        @ColumnInfo(name = "latitude") val lat: Double,
        @ColumnInfo(name = "longitude") val lon: Double,
        @ColumnInfo(name = "accuracy") val accuracy: Float?,
        @ColumnInfo(name = "altitude") val altitude: Double?,
        @ColumnInfo(name = "bearing") val bearing: Float?,
        @ColumnInfo(name = "speed") val speed: Float?,
        @ColumnInfo(name = "provider") val provider: String?)