package hw6

import java.lang.Exception
import kotlin.random.Random

class Car(brand: String, speed: Int) {

    constructor(brand: String, speed: Int, price : Int) : this(brand, speed) {

    }
    private var brand:String = brand
        get() {
            return field
        }
    set(value: String){
       if (value != ""){
           field = value
       }
    }

    private var speed: Int = speed
        get() {
            return field
        }
        set(value) {
            if (value > 0) field = value
        }

    private var price: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value > 0) field = value
        }

    fun start(): Int{
        val check = Random.nextInt(0, 20)
        if (check % 2 == 0)
        throw IllegalNumber("$check - не повезло")
        else return check
    }
}

class IllegalNumber(message: String) : Exception()

fun main() {
    val car1 = Car("Toyota", 240, 5000)
    val car2 = Car("Honda", 180, 5000)
    val car3 = Car("Lada", 1700)
    val car4 = Car("Volkswagen", 120)

    try{
    println(car1.start())
    println(car2.start())
    println(car3.start())
    println(car4.start())
    } catch (e: IllegalNumber){
        e.printStackTrace()
    }
}