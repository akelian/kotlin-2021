package hw5

fun task1(){
    println("line")
    val line = readLine().orEmpty()
    print("A")
    val a = readLine().orEmpty()
    print("B")
    val b = readLine().orEmpty()
    val subline = line.substringAfter(a).substringBefore(b)

    print(subline)
}

fun task2(){
    println("line")
    val line = readLine().orEmpty()
    val char0 = line[0]
    val char3 = line[3]
    val newLine = char3 + line.substring(1, 3) + char0 + line.substring(4)
    print(newLine)
}

fun task3(){
    println("line")
    val line = readLine().orEmpty()

    for (word in line.split(" ").toTypedArray()){
        val revWord = word.reversed()
        if (word == revWord) print("$word ")
    }
}

fun main() {
//    task1()
//    task2()

    task3()
}
