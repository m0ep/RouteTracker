package de.florianm.android.routetracker.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import de.florianm.android.routetracker.db.dao.RoutePointDao
import de.florianm.android.routetracker.db.model.RoutePoint

@Database(entities = [RoutePoint::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun routePointDao(): RoutePointDao
}