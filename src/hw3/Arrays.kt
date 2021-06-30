package hw3

import kotlin.random.Random

class Arrays {
    fun task1(){
        var arrays = emptyArray<Int>()
        for (i in 1..20 step 2){
            if (i%2 == 0 && i !=0) arrays+=i
        }
        for (i in arrays.indices) print("${arrays[i]} ")
        for (i in arrays.indices-0) print("\n${arrays[i]} ")
    }

    fun task2(){
        var arr = emptyArray<Int>()
        for(i in 1..99){
            if (i%2 == 1){
                arr+= i
            }
        }

        for (i in arr.indices){
            print("${arr[i]} ")
        }

        for (i in arr.indices.reversed()){
            if (i == arr.lastIndex) print("\n")
            print("${arr[i]} ")
        }
    }

    fun task3(){
        var arr = emptyArray<Int>()
        var countOdd = 0
        var countEven = 0
        for (i in 0..14){
            arr += Random.nextInt(0,100)
            if (arr[i]%2 == 0) countEven+= 1
            else countOdd += 1
            print("${arr[i]} ")
        }
        print("\n Odd: $countOdd, Even: $countEven")
    }

    fun task4(){
        var arr = emptyArray<Int>()
        for (i in 0..19){
            arr += Random.nextInt(0,20)
            print("${arr[i]} ")
        }
        print("\n")
        for (i in arr.indices){
            if (arr[i]%2 == 1) {
                arr[i] = 0

            }
            print("${arr[i]} ")
        }
    }

    fun task5(){
        var arrA = emptyArray<Int>()
        var arrB = emptyArray<Int>()
        var counterA = 0
        var counterB = 0
        val avgIntA: Int
        val avgIntB: Int

        for (i in 0..4){
            arrA += Random.nextInt(0,15)
            counterA += arrA[i]
            arrB += Random.nextInt(0,15)
            counterB += arrB[i]
        }
        for (i in arrA.indices){
            if(i == arrA.lastIndex) print("${arrA[i]}\n")
            else print("${arrA[i]} ")
        }
        for (i in arrB.indices){
            if(i == arrB.lastIndex) print("${arrB[i]}\n")
            else print("${arrB[i]} ")
        }
        avgIntA = counterA.div(arrA.size)
        avgIntB = counterB.div(arrB.size)
        if(avgIntA > avgIntB) print("A is bigger than B: $avgIntA > $avgIntB")
        else print("B is bigger than A: $avgIntB > $avgIntA")

    }

    fun task6(){
        var arr = emptyArray<Int>()

        for (i in 0..3){
            arr += Random.nextInt(0,10)
            print("${arr[i]} ")
        }

        for (i in arr.indices){
            if (i != arr.lastIndex) {
                if (arr[i] <= arr[i + 1]) {
                    continue
                } else {
                    println("Массив не является возрастающим")
                    break
                }
            } else println("Массив является возрастающим")
        }
    }

    fun task10(){
        var isNegative = false

        do {
            val num = readLine().orEmpty().toInt()
            var arr = emptyArray<Int>()
            var positiveArr = emptyArray<Int>()

            if (num > 3){
                for (i in 0 until num){
                    arr += Random.nextInt(0,num)
                    print("${arr[i]} ")
                    if (arr[i]%2 == 0){
                        positiveArr+= arr[i]
                    }
                }
                print("\n")
                for (i in positiveArr.indices){
                    print("${positiveArr[i]} ")
                }
            } else{
                isNegative = true
                println("Не подходящее число")
            }
        } while (isNegative)

    }

    fun task11(){
        val arr = arrayOf<Array<Int>>()
        print("Rows")
        val rows = readLine().orEmpty().toInt()
        print("Cols")
        val cols = readLine().orEmpty().toInt()
        val transpArr = arrayOf<Array<Int>>()

        fun recount (arr: Array<Array<Int>>){
            for (array in arr){
                for (value in array){
                    print("$value")
                }
                println()
            }
        }
        for (i in 1..cols){
            for (j in 1..rows){
                arr[i][j] += Random.nextInt(0, 50)
            }
        }
        recount(arr)

        for (i in 0..rows){
            for (j in 0..cols){
                transpArr[i][j] += arr[j][i]
            }
        }

        recount(transpArr)
    }
}