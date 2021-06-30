package hw4

data class Computer(val CPU: String, val MEM: String, val HDD: String) {
    fun description(){
        print("$CPU, $MEM, $HDD")
    }
}