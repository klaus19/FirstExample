package interfaces

import abstractclasses.Employee
import inheritance.Customer


interface CustomRepository {

    val isEmpty:Boolean
       get() = true

    fun store(obj:Customer){
        //implement code to store
    }

    fun getById(id:Int): Customer
}

interface EmployeeRepository{

    fun store(obj:Employee){

    }

    fun getById(id: Int):Employee
}

class SQLCustomerRepository:CustomRepository{
    override fun getById(id: Int): Customer {
          return Customer()
    }

    override fun store(obj: Customer) {

        super.store(obj)

    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1{

    fun funA(){
        println("This is method A")
    }
}

interface Interface2{

    fun funA(){
        println("This is method B")
    }
}

class Class1and2 :Interface1,Interface2{
    override fun funA() {
        super<Interface2>.funA()
    }
}

fun main(){

    val c = Class1and2()
    c.funA()


}