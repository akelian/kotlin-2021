package hw8

import java.math.BigDecimal
import kotlin.random.Random

fun magicBall() {
    val input = readLine().orEmpty()
    when (Random.nextInt(0, 6)) {
        0 -> println("Да")
        1 -> println("Нет")
        2 -> println("Скорее всего да")
        3 -> println("Скорее всего нет")
        4 -> println("Возможно")
        5 -> println("Имеются перспективы")
        6 -> println("Вопрос задан неверно")
    }
}

fun sectionCheck() {
    val num: Int = Random.nextInt(5, 155)
    if (num in 25..125) print("$num в диапазоне")
    else print("$num вне диапазона")
}

fun breakNum(input: String? = readLine()): Int {
    var sum = 0
    if (input!!.isNotEmpty()) {
        input.toString().forEach { char ->
            sum += Character.getNumericValue(char)
            println(sum)
        }
    }
    return sum
}

fun printAlphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    toString()
}

fun evenOrOdd() {
    val a: Int? = readLine()?.toInt()
    val b: Int? = readLine()?.toInt()
    when {
        a?.rem(2) == 0 -> a * b!!
        a?.rem(2) != 0 -> a!! + b!!

    }
}

fun isConvertFillInConvert() {
    do {
        val a: Int? = readLine()?.toInt()
        val b: Int? = readLine()?.toInt()
        val c: Int? = readLine()?.toInt()
        val d: Int? = readLine()?.toInt()

        when {
            a!! < c!! && b!! < d!! -> println("Ok")
            a!! < d!! && b!! < c!! -> println("Ok")
            else -> println("Bad")
        }
        println("Again?")
    } while (readLine() != "0")
}

fun convertDecimal(num:Int? = readLine()?.toInt()): String? {
    return num?.let { Integer.toBinaryString(it) }
}


fun main() {
//    sectionCheck()
//    println("atleast ${breakNum()}")
//    println(printAlphabet())
//    val max: () -> Int = {  max(1 * 2 *3, 3 + 3 + 1) }
//    isConvertFillInConvert()
    print(convertDecimal())
}