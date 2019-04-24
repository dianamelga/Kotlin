data class Familiar(val name:String="Diana", val edad:Int=24, val colorCabello:String="Negro")
data class Result(val result:Int, val status:Boolean)


fun calcular(a:Int, b:Int) :Result {
    if(a*2 > b) {
        return Result(a*2, true)
    }else{
        return Result(a*2, false)
    }
}


fun main(args: Array<String>) {
    var diana = Familiar()

    val (name, _, color) = Familiar()

    println(name)
    println(color)

    val(result, status) = calcular(4, 2)
    println(result)
    println(status)
}