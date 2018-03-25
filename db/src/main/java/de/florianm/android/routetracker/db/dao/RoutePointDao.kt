package de.florianm.android.routetracker.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import de.florianm.android.routetracker.db.model.RoutePoint

@Dao
abstract class RoutePointDao {
    @Insert
    abstract fun insert(routePoint: RoutePoint)

    @Query("SELECT * FROM RoutePoint WHERE track_id=:trackId ORDER BY id DESC LIMIT 1")
    abstract fun getLast(trackId: Long): RoutePoint?
}