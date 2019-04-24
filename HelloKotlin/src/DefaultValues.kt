fun saluda(saludo:String = "Hola a todos"){
    println(saludo)
}

fun otraFuncion(edad:Int = 0, esAdulto:Boolean = false, tieneRopa:Boolean = true){

}

fun main(args: Array<String>) {
    saluda("hola que paso")
    saluda()

    otraFuncion(esAdulto = true, edad = 30, tieneRopa = false)
}

