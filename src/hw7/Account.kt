package hw7

class Account<T>(id: T, sum: Int) {
    val id: T = id
    get() {return field}

    private var sum:Int = sum
        get() {
            return field
        }
        set(value) {
            field = value
        }

    fun print(value: T){
        print(value.toString())
    }
}

fun main() {
    val acc1 = Account("123", 5000)
    val acc1Id =  acc1.id
    print(acc1Id)
    val acc2 = Account(123, 5000)
    val acc2Id =  acc2.id
    print(acc2Id)

    print(acc2.id)

}