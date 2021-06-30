package hw7

class CollectionsHW {

    //    private val numOfIterations = readLine().orEmpty().toInt()
    private var arr = mutableListOf<Int>()
    private var arr2 = mutableListOf<Int>()
    private fun fillList() {
        for (i in 0..8) {
            val num = readLine().orEmpty().toInt()
            arr.add(num)
            arr2.add(num)
        }
    }

    private fun sort() {
        for (i in arr.indices) {
//            println("$index = $element")

            for (j in arr.indices){
                println("$i , $j")
                if (j != arr.lastIndex &&  j == i) {
                    println("$i == $j")
                    if (arr[j] == arr[i]) {
                        arr.removeAt(arr[i])
                    }
                }
            }

        }
    }

    fun print() {
        println()
        arr2.forEach {
            print(it)
        }

    }

    fun task1Start() {
        fillList()
        sort()
        print()
    }
}

fun main() {
    val gen = CollectionsHW()
    gen.task1Start()
}