package hw1

class Conditions {

    fun task1 () {
        println("Введите число")
        when (readLine().orEmpty().toInt()) {
            in 0..9 -> println("Положительное однозначное")
            in 10..99 -> println("Положительное двухзначное")
            in 100..999 -> println("Положительное трехзначное")
            in -9..-1 -> println("Положительное однозначное")
            in -99..-10 -> println("Положительное двухзначное")
            in -999..-100 -> println("Положительное трехзначное")
        }
    }

    fun task2 (){
        println("Введите число a")
        val a = readLine().orEmpty().toInt()
        println("Введите число b")
        val b = readLine().orEmpty().toInt()
        println("Введите число c")
        val c = readLine().orEmpty().toInt()

        if (a < b + c && b < a + c && c < a + b)
            println("треугольник")
        else println("нетреугольник")
    }

    fun task3 (){
        var num = readLine().orEmpty().toInt()

        println("Введите число")
        when {
           num > 0 -> num+=1
           num < 0 -> num-=2
           num == 0 -> num = 10
        }
        println(num)

    }
}
