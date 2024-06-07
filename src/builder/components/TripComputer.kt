package builder.components

import builder.cars.Car

class TripComputer {

    private var car : Car? = null

    fun setCar(car : Car){
        this.car = car
    }

    fun showFuelLevel(){
        car?.let {
            println("Fuel level: ${it.fuel}")
        }
    }

    fun showStatus(){
        car?.let{
            if(it.engine.isStarted()){
                println("Car is started")
            } else {
                println("Car isn't started")
            }
        }
    }
}