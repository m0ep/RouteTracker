package de.florianm.android.routetracker

import android.app.Application
import de.florianm.android.routetracker.di.AppComponent
import de.florianm.android.routetracker.di.AppModule
import de.florianm.android.routetracker.di.DaggerAppComponent


class App : Application() {
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        component = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    companion object {
        @JvmStatic
        lateinit var INSTANCE: App
    }
}