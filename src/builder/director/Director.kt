package builder.director

import builder.builders.Builder
import builder.cars.CarType
import builder.components.Engine
import builder.components.GPSNavigator
import builder.components.Transmission
import builder.components.TripComputer

class Director {

    fun constructSportsCar(builder : Builder){
        builder.setCarType(CarType.SPORT_CAR)
        builder.setSeats(2)
        builder.setEngine(Engine(3.0,0.0))
        builder.setTransmission(Transmission.SEMI_AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPSNavigator(GPSNavigator())
    }

    fun constructCityCar(builder : Builder){
        builder.setCarType(CarType.CITY_CAR)
        builder.setSeats(4)
        builder.setEngine(Engine(1.8,0.0))
        builder.setTransmission(Transmission.AUTOMATIC)
        builder.setTripComputer(TripComputer())
    }

    fun constructSUV(builder : Builder){
        builder.setCarType(CarType.SUV)
        builder.setSeats(4)
        builder.setEngine(Engine(2.5,0.0))
        builder.setTransmission(Transmission.MANUAL)
        builder.setGPSNavigator(GPSNavigator())
    }

}