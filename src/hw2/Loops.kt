package hw2

class Loops {

    fun task1(){
        println("Введите последовательность")
        val num = readLine().orEmpty()
        var counter = 0
        while (counter < num.length){
            counter++
        }
        println(counter)
    }

    fun task2(){
        val startAmount = 1000
        var currentAmount:Int = 0
        println("Введите количество месяцев")
        val monthQuantity = readLine().orEmpty().toInt()
        var i = 0
        while (i < monthQuantity){
            if (i == 0){
                currentAmount = startAmount
            }
            currentAmount += currentAmount/100*2
            i++
        }
        println(currentAmount)
    }

    fun task3(){
        for(i in 0..17){
            if (i == 13 || i == 4){
                continue
            }
            println(i)
        }
    }

    fun task4(){
        val population = 10000000
        val dead = 8
        val born = 14
        var newPopulation = 0
        var perThousandPpl: Int
        for(i in 0..10){
            if (i == 0) {
                newPopulation = population
                perThousandPpl = population/1000
            }
            else perThousandPpl = newPopulation/1000
            for (j in 0..perThousandPpl){
                newPopulation = newPopulation + born - dead
            }
            when(i){
                1 -> println("за $i год популяция составит $newPopulation")
                in 2..4 -> println("за $i года популяция составит $newPopulation")
                in 5..10 -> println("за $i лет популяция составит $newPopulation")
            }

        }
    }

    fun task5(){
        for (i in 1000..9999 step 3){
            println(i)
        }
    }

    fun task6(){
        for (i in 1..9){
            for (j in 1..9){
                print("${i*j} ")
            }
            println()
        }
    }

    fun task7(){
        var num = 2
        for(i in 0..20){
            num *= 2
            print("$num ")

        }
    }
}