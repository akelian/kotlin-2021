package hw4.interfaces

import kotlin.random.Random

class Shuttle: IStart {
    override fun systemCheck(): Boolean {
        val check = Random.nextInt(0, 10)
        return check > 3
    }

    override fun engineLaunch() {
        println("Here we go")
    }

    override fun start() {
        println("Start")
    }
}