fun main(args: Array<String>) {

    val a = esMayor(6)
    defineTipo(3)
}

fun esMayor(data:Int) :Boolean =
    if (data > 0) {
        println("$data")
        true
    }else {
        println("$data")
        false
    }

fun defineTipo(data: Any) {
    if(data is String) {
        println(data.length)
    }else if(data is Int) {
        println("${data*2}")
    }
}