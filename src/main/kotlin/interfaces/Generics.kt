package interfaces

import inheritance.Customer

interface Repository<T>{

    fun getById(id:Int):T
    fun getAll():List<T>


    fun main(){

        val customerRepo = GenericRepository<Customer>()

        val customer = customerRepo.getById(10)

        val customers = customerRepo.getAll()

    }


}
