package classes

enum class Priority(val value:Int){
    MINOR(-1){
        override fun toString(): String {
            return "Minor Priority"
        }

        override fun text(): String {
            throw java.lang.UnsupportedOperationException("not implemented")
        }
    },
    NORMAL(0){
        override fun text(): String {
            throw java.lang.UnsupportedOperationException("not implemented")
        }
    },
    MAJOR(1){
        override fun text(): String {
            throw java.lang.UnsupportedOperationException("not implemented")
        }
    },
    CRITICAL(10){
        override fun text(): String {
            throw java.lang.UnsupportedOperationException("not implemented")
        }
    };

    abstract fun text():String
}

fun main(){


//    val priorities = Priority.values()
//    for (p in priorities){
//        val sam = p
//        println(sam)
//    }
    val priority = Priority.NORMAL
    println(priority)
    println(priority.value)
    println(Priority.CRITICAL.ordinal)
    println(Priority.CRITICAL.name)

    for (priorityInList in Priority.values()){

        println(priorityInList)
    }

    //Value Of method
    val p =Priority.valueOf("MAJOR")
    println(p.ordinal)

    val pt = Priority.MINOR
    println(pt.text())
}