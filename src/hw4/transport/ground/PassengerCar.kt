package hw4.transport.ground

class PassengerCar(
    val bodyType: String, val passengerNumber: Int, wheelsNum: Int,
    fuelConsumption: Int, horsePower: Int, speedLimit: Int, mass: Int, brand: String
) : Ground(wheelsNum, fuelConsumption, horsePower, speedLimit, mass, brand) {

    override fun calculatePower(horsePower: Int): Double {
        return super.calculatePower(horsePower)
    }

    fun calculateDistance(time: Int){
        print("За время $time ч, автомобиль $brand\n" +
                "двигаясь с максимальной скоростью $speedLimit км/ч\n" +
                "проедет ${speedLimit * time} км и израсходует ${fuelThroughTime(time, fuelConsumption)} литров топлива.")
    }

    private fun fuelThroughTime(time: Int, fuelConsumption: Int): Int{
        return fuelConsumption * time
    }
}