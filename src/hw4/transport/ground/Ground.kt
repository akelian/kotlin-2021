package hw4.transport.ground

import hw4.transport.Transport

open class Ground(
    val wheelsNum: Int, val fuelConsumption: Int, horsePower: Int,
    speedLimit: Int, mass: Int, brand: String
) : Transport(horsePower, speedLimit, mass, brand) {

}