package basics

fun main() {

    for (a in 1..100){
        println(a)
    }

    val numbers = 1..50
    for (a in numbers){
        println(a)
    }

    for (a in 10 downTo 1){
        println(a)
    }

    for (a in 10.. 1){
        println(a)
    }

    for (b in 100 downTo 1 step 5){
        println(b)
    }

    val cities = listOf("xsdf","weh","fq")
    for (city in cities){
        println(city)
    }

}