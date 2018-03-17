package de.florianm.android.routetracker.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

    @Provides
    fun providesContext(): Context = context

    @Provides
    fun providesPreferences(context: Context): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
}