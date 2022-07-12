package function

fun hello():Unit{

    println("Hello")
}

fun throwingException():Nothing{

    throw Exception("This function throws an Exception")

}

fun returnFour():Int{
    return 4
}

fun takingString(name:String){
    println(name)
}

fun sum(x:Int,y:Int,z:Int=0,w:Int=0) = x+y+z+w

fun printDetails(name: String,email:String="",phone:String){
    println("name:$name-email:$email-phone:$phone")
}
fun main(){

    hello()

    val value = returnFour()
    println(value)

    takingString("Books")

    sum(4,5)
    sum(1,2,3)

    printDetails("tsd", phone = "2345")

}