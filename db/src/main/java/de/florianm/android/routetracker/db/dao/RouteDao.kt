package de.florianm.android.routetracker.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Update
import de.florianm.android.routetracker.db.model.Route

@Dao
abstract class RouteDao {
    @Insert
    abstract fun insert(route: Route)

    @Update
    abstract fun update(route: Route)
}