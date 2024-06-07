package builder.components

class Engine(
    val volume : Double,
    var mileage : Double
) {
    var started : Boolean = false
        private set

    fun on(){
        started = true
    }

    fun off(){
        started = false
    }

    fun isStarted() : Boolean {
        return started
    }

    fun go(mileage : Double){
        if(started){
            this.mileage += mileage
        } else{
            println("Cannot go(), you must start the engine first!!")
        }
    }

}