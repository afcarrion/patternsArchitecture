package builder.cars

import builder.components.Engine
import builder.components.GPSNavigator
import builder.components.Transmission
import builder.components.TripComputer

class Car (
    val carType : CarType,
    val seats : Int,
    val engine : Engine,
    val transmission : Transmission,
    val tripComputer : TripComputer?,
    val gpsNavigator : GPSNavigator
    ) {

    var fuel : Double = 0.0
        private set

    init {
        tripComputer?.setCar(this)
    }

    fun setFuel(fuel : Double){
        this.fuel = fuel
    }

}