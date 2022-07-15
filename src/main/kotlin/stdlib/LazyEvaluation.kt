package stdlib

fun main(){

    val elements = 1..1000000000

//    val output = elements.asSequence().filter { it<30 }.map { Pair("Yes",it) }
//
//    output.forEach {
//        println(it)
//    }


    val newList = elements.asSequence().take(30).sum()
    println(newList)

    val numbers = generateSequence(1) { x->x+10 }
    val s = numbers.take(30).sum()
    println(s)

    val lazyInit:Int by lazy { 10 }
    println(lazyInit)

}