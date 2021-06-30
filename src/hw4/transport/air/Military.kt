package hw4.transport.air

class Military(val evacuation: Boolean, val ammoAmount: Int, wingspan: Int,
               takeOffLandingMinimalLength: Int, horsePower: Int, speedLimit: Int, mass: Int, brand: String
): Air(wingspan, takeOffLandingMinimalLength, horsePower, speedLimit, mass, brand){

    override fun calculatePower(horsePower: Int): Double {
        return super.calculatePower(horsePower)
    }

    fun shot(){
        if(ammoAmount > 0) print("Ракета пошла")
        else print("Боеприпасы отсутствуют")
    }

    fun bailout(){
        if(evacuation > true) print("Success")
        else print("Fail")
    }
}