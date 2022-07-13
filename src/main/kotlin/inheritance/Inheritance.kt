package inheritance

open class Person{
     var name:String = "xyz"
    open fun validate(){

    }

}

open class Customer:Person{

    final override fun validate(){
        isName.name = "Tejas"
    }

    //Using member variable from one class to another.
    var isName = Person()

    constructor():super(){

    }

}

class SpecialCustomer:Customer(){


}

fun main(){

    val customer = Customer()

    customer.validate()



}