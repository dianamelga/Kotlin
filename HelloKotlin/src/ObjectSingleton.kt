object Validaciones{

    fun passwordValida(pass:String) = pass.isNotEmpty() && pass.length > 10
    fun esNumero(dato:Any) = dato is Int


}

class ClaseUniversal {
    companion object { //singleton
        fun create() :ClaseUniversal = ClaseUniversal()

    }
}

fun main(args:Array<String>) {
    println("Ingrese su contrasenha")
   // val passw:String = readLine()!!
 //   println(Validaciones.passwordValida(passw))

    val c1 = ClaseUniversal.create()
    val c2 = ClaseUniversal.create()
    val c3 = ClaseUniversal.create()

    println(c1)
    println(c2)
    println(c3)

    val listA = arrayListOf<String>("Hola", "Kotlin", "Java")
    val listB : ArrayList<String>
    println(listA == listB)


}

