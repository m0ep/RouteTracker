package de.florianm.android.routetracker.di

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import de.florianm.android.routetracker.db.AppDatabase
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun providesDatabase(context: Context) =
            Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "route.db").build()

    @Provides
    fun providesRoutePointDao(appDatabase: AppDatabase) =
            appDatabase.routePointDao()

    @Provides
    fun providesRouteSegmentDao(appDatabase: AppDatabase) =
            appDatabase.routeSegmentDao();
}