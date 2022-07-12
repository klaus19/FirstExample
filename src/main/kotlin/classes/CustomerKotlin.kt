package classes


data class CustomerKotlin(var name:String, var address:String){
    override fun toString(): String {
        return "{\"id\": \"$address\",\"name\": \"$name\"}"

    }
}

fun main(){

    val customer1 = CustomerKotlin("xyz","eds")
    val customer2 = CustomerKotlin("x","eds")

    println(customer1)


}