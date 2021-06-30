package hw4

import hw4.interfaces.Cosmodrome
import hw4.interfaces.Shuttle

fun main() {
//    val computer = Computer("i5", "16GB", "1TB")
//    computer.description()

    val cosmodrome = Cosmodrome()
    val shuttle = Shuttle()
    cosmodrome.launch(shuttle)

}