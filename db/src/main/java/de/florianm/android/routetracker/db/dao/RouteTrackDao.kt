package de.florianm.android.routetracker.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import de.florianm.android.routetracker.db.model.RouteTrack

@Dao
abstract class RouteTrackDao {

    @Insert
    abstract fun insert(routeTrack: RouteTrack)

    @Update
    abstract fun update(routeTrack: RouteTrack)

    @Query("SELECT * FROM RouteTrack WHERE id=:id")
    abstract fun getRouteTrackById(id: Long): RouteTrack?
}