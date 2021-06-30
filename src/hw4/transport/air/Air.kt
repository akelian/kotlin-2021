package hw4.transport.air

import hw4.transport.Transport

open class Air(
    val wingspan: Int, val takeOffLandingMinimalLength: Int, horsePower: Int, speedLimit: Int, mass: Int,
    brand: String
) : Transport(
    horsePower,
    speedLimit, mass, brand
) {
}