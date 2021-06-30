package hw4.transport

open class Transport(val horsePower: Int, val speedLimit: Int, val mass: Int, val brand: String) {

    open fun calculatePower(horsePower: Int) : Double {
        return horsePower * 0.74
    }
}