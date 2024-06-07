package builder.cars

import builder.components.Engine
import builder.components.GPSNavigator
import builder.components.Transmission
import builder.components.TripComputer

class Manual(
    private val carType: CarType,
    private val seats : Int,
    private val engine : Engine,
    private val transmission : Transmission,
    private val tripcomputer : TripComputer?,
    private val gpsNavigator : GPSNavigator?
) {

    fun print() : String {
        var info = ""
        info += "Type of car: $carType\n"
        info += "Count of seats: $seats\n"
        info += "Engine: volume - ${engine.volume}; mileage - ${engine.mileage}\n"
        info += "Transmission: $transmission\n"
        info += if (tripcomputer != null) {
            "Trip Computer : Functional\n"
        } else {
            "Trip Computer : N/A\n"
        }
        info += if (gpsNavigator != null) {
            "GPS Navigator : Functional\n"
        } else {
            "GPS Navigator : N/A\n"
        }
        return info
    }
}