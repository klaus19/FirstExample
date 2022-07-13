package tidbits

open class Person{

}

class Employee:Person(){

    fun vacationDays(days:Int){
        if (days<60){
            println("You need more vacation")
        }
    }

}

class Contractor:Person(){


}

var input:Any=10


fun main(){

    val str = input as? String

    println(str?.length)

}