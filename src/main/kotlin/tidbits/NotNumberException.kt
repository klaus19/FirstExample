package tidbits


//Throwable is a base class of exception
class NotNumberException:Throwable(){

}

fun checkNumber(obj:Any){
    when(obj){
        !is Int,Long,Float,Double -> throw NotNumberException()
    }
}


fun main(){

    try {
        checkNumber("A")
    }catch (e:NotNumberException){
        println("It's not a number")
    }


}