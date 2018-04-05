package de.florianm.android.routetracker.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import de.florianm.android.routetracker.db.dao.RouteDao
import de.florianm.android.routetracker.db.dao.RoutePointDao
import de.florianm.android.routetracker.db.dao.RouteSegmentDao
import de.florianm.android.routetracker.db.model.Route
import de.florianm.android.routetracker.db.model.RoutePoint
import de.florianm.android.routetracker.db.model.RouteSegment

@Database(
        entities = [
            RoutePoint::class,
            RouteSegment::class,
            Route::class],
        version = 1)
@TypeConverters(ThreeTenBpConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun routePointDao(): RoutePointDao
    abstract fun routeSegmentDao(): RouteSegmentDao
    abstract fun routeDao(): RouteDao
}