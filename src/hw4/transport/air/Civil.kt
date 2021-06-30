package hw4.transport.air

class Civil(val passengersNumber : Int, val businessAvailable: Boolean, wingspan: Int, takeOffLandingMinimalLength: Int, horsePower: Int, speedLimit: Int, mass: Int, brand: String) :
    Air(wingspan, takeOffLandingMinimalLength, horsePower, speedLimit, mass, brand) {

    override fun calculatePower(horsePower: Int): Double {
        return super.calculatePower(horsePower)
    }

    fun passngerCapacity(passengersInput: Int){
        when{
            passengersInput <= passengersNumber -> ("Норм")
            passengersInput > passengersNumber -> ("Многовато")
        }
    }
}