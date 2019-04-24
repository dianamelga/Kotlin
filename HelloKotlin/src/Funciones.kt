fun hello():Unit {  //unit es similar a void en java ,es el dato a retornar en esta funcion
    println("Hola a todos")

}

fun suma(a:Int, b:Int) {
    println("la suma de $a y $b es igual a ${a+b}")

}
/*
fun max(a:Int, b:Int):Int {
    return if(a>b)
        a
    else
        b
}
*/

fun max(a:Int, b:Int) = if (a>b) a else b


fun main(args: Array<String>) {
    println(max(4,9))
}