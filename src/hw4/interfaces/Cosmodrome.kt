package hw4.interfaces

class Cosmodrome {
    fun launch(iStart: IStart) {
        if(!iStart.systemCheck()){
            print("Fail")
        } else {
            iStart.engineLaunch()
            for (i in 3 downTo  0){
                println(i)
            }
            iStart.start()
        }
    }
}