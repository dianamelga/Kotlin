class Ejemplo {
    fun hola() {
        println("Hola Kotlin")
    }
}

class Persona(val nombre:String){
    init {
        println("Nombre $nombre")
    }

    constructor(name:String, edad:Int):this(name){
        println("Nombre $name, edad $edad")
    }

}



 open class Base(val inicial:Int) { //debe tener open para poder heredar
    open fun imprimeAlgo() { //debe tener open para poder sobreescribir la funcion
        println("Algo $inicial")
    }
}

class General(val d:Int) : Base(d){ //herencia

    override fun imprimeAlgo() {
        super.imprimeAlgo()
        val suma:Int = 4 + d
    }
}

fun main(args: Array<String>) {
    val persona = Persona("Diana", 23)
    println(persona)

    val general = General(9)
    general.imprimeAlgo()
}