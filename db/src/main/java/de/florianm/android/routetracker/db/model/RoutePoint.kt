package de.florianm.android.routetracker.db.model

import android.arch.persistence.room.*
import org.threeten.bp.OffsetDateTime


@Entity(tableName = "RoutePoint",
        indices = [(Index(
                value = ["track_id"],
                name = "idx_point_track_id"))],
        foreignKeys = [(ForeignKey(
                entity = RouteTrack::class,
                parentColumns = ["id"],
                childColumns = ["track_id"],
                onDelete = ForeignKey.CASCADE))]
)
data class RoutePoint(
        @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Long,
        @ColumnInfo(name = "created_at") val createdAt: OffsetDateTime = OffsetDateTime.now(),
        @ColumnInfo(name = "track_id") val trackId: Long,
        @ColumnInfo(name = "latitude") val lat: Double,
        @ColumnInfo(name = "longitude") val lon: Double,
        @ColumnInfo(name = "accuracy") val accuracy: Float?,
        @ColumnInfo(name = "altitude") val altitude: Double?,
        @ColumnInfo(name = "bearing") val bearing: Float?,
        @ColumnInfo(name = "speed") val speed: Float?,
        @ColumnInfo(name = "provider") val provider: String?)