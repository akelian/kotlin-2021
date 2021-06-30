package hw4.transport.ground

class FreightСar(
    val liftingCapacity: Int, wheelsNum: Int, horsePower: Int, speedLimit: Int, mass: Int,
    brand: String
) : Ground(
    wheelsNum, wheelsNum,
    horsePower,
    speedLimit,
    mass, brand
) {
    override fun calculatePower(horsePower: Int): Double {
        return super.calculatePower(horsePower)
    }

    fun liftCapacityCheck(load: Int){
        when{
            load <= liftingCapacity -> print("Грузовик загружен")
            load > liftingCapacity -> print("Вам нужен грузовик побольше")
        }
    }
}