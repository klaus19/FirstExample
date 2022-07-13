package tidbits


fun capitalAndPopulation(country:String):Pair<String,Long>{

    return Pair("Madrid",345672)
}

fun capitalCountry(country: String):Triple<String,String,Long>{

    return Triple("Madrid","Europe",2345678)
}

fun main(){

val result = capitalAndPopulation("Madrid")

    println(result.first)
    println(result.second)


    val res = capitalCountry(country ="Madrid")
    println(res.first)
    println(res.second)
    println(res.third)


}