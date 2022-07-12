package classes

data class CustomerKotlin(var name:String, var address:String)

fun main(){

    val customer1 = CustomerKotlin("xyz","eds")
    val customer2 = CustomerKotlin("xyz","eds")


    if (customer1==customer2){
        println("They're same")
    }


}