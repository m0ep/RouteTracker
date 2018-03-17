package de.florianm.android.routetracker.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import de.florianm.android.routetracker.db.dao.RoutePointDao
import de.florianm.android.routetracker.db.model.RoutePoint

@Database(entities = [RoutePoint::class], version = 1)
@TypeConverters(ThreeTenBpConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun routePointDao(): RoutePointDao
}