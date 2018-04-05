package de.florianm.android.routetracker

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import de.florianm.android.routetracker.db.dao.RouteDao
import de.florianm.android.routetracker.db.dao.RoutePointDao
import de.florianm.android.routetracker.db.dao.RouteSegmentDao
import de.florianm.android.routetracker.db.model.RoutePoint
import de.florianm.android.routetracker.di.Injector

class LocationUpdateService : BroadcastReceiver() {

    val routePointDao: RoutePointDao = Injector.get().routePointDao()
    val routeSegmentDao: RouteSegmentDao = Injector.get().routeSegmentDao()
    val routeDao: RouteDao = Injector.get().routeDao()

    private var locationClient: FusedLocationProviderClient? = null

    override fun onReceive(context: Context?, intent: Intent?) {
        if(null == locationClient){
            locationClient = LocationServices.getFusedLocationProviderClient(context!!)
        }

        val action = intent?.action ?: ""
        when (action){
            ACTION_TRACKING_START -> startTrecking(context!!, intent!!)
            ACTION_TRACKING_UPDATE -> onTrackingUpdate(context!!, intent!!)
            ACTION_TRACKING_STOP -> stopTracking(context!!, intent!!)
        }
    }

    private fun startTrecking(context: Context, intent: Intent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun stopTracking(context: Context, intent: Intent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun onTrackingUpdate(context: Context, intent: Intent) {
        if(!LocationResult.hasResult(intent)){
            return
        }

        val locationResult = LocationResult.extractResult(intent)
        val lastLocation = locationResult.lastLocation
        val segmentId: Long = -1L

        val routePoint = RoutePoint(
                segmentId = segmentId,
                lat = lastLocation.latitude,
                lon = lastLocation.longitude,
                bearing = lastLocation.bearing,
                speed = lastLocation.speed,
                altitude = lastLocation.altitude,
                accuracy = lastLocation.accuracy,
                provider = lastLocation.provider)

        routePointDao.insert(routePoint)
    }

    companion object {
        const val ACTION_TRACKING_START = "tracking_start"
        const val ACTION_TRACKING_UPDATE = "tracking_update"
        const val ACTION_TRACKING_STOP = "tracking_stop"
    }
}