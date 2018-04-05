package de.florianm.android.routetracker.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Component
import de.florianm.android.routetracker.db.dao.RouteDao
import de.florianm.android.routetracker.db.dao.RoutePointDao
import de.florianm.android.routetracker.db.dao.RouteSegmentDao
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    DatabaseModule::class
])
interface AppComponent {

    fun context(): Context
    fun routeDao(): RouteDao
    fun routePointDao(): RoutePointDao
    fun routeSegmentDao(): RouteSegmentDao
    fun preferences(): SharedPreferences
}