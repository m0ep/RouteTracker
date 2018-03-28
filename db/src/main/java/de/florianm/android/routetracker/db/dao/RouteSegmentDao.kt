package de.florianm.android.routetracker.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import de.florianm.android.routetracker.db.model.RouteSegment

@Dao
abstract class RouteSegmentDao {

    @Insert
    abstract fun insert(routeSegment: RouteSegment)

    @Update
    abstract fun update(routeSegment: RouteSegment)

    @Query("SELECT * FROM RouteSegment WHERE id=:id")
    abstract fun getRouteTrackById(id: Long): RouteSegment?
}