package abstractclasses


abstract class StoredEntity{
    val isActive=true
    abstract fun start()

    fun status():String{
        return isActive.toString()
    }
}

class Employee:StoredEntity(){
    override fun start() {
        throw java.lang.UnsupportedOperationException("not implemneted")
    }


}

fun main(){

    val se = Employee()
    se.isActive
    se.start()

}