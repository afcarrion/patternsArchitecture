package builder.components

class GPSNavigator{
    val route : String

    constructor(){
        route = "Av siempreViva, Springfield"
    }

    constructor(manualRoute : String){
        this.route = manualRoute
    }
}