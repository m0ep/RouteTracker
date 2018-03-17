package de.florianm.android.routetracker.di

import de.florianm.android.routetracker.App

class Injector private constructor() {
    companion object {
        @JvmStatic
        fun get(): AppComponent = App.INSTANCE.component
    }
}