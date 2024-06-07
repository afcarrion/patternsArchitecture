package builder

import builder.builders.Builder
import builder.builders.CarBuilder
import builder.builders.ManualBuilder
import builder.director.Director

class Demo {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val director = Director()

            // Director gets the concrete builder object from the client
            // (application code). That's because application knows better which
            // builder to use to get a specific product.
            val builder = CarBuilder()
            //director.constructSportsCar(builder)
            director.constructSUV(builder)
            // The final product is often retrieved from a builder object, since
            // Director is not aware and not dependent on concrete builders and
            // products.
            val car = builder.getResult()
            println("Car built:\n${car.carType}")

            val manualBuilder = ManualBuilder()

            // Director may know several building recipes.
            director.constructSUV(manualBuilder)
            val carManual = manualBuilder.getResult()
            println("\nCar manual built:\n${carManual.print()}")
        }
    }
}
