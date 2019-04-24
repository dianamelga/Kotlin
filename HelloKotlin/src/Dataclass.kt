data class Auto(var marca:String, private var puertas:Int) {
    var numPuertas = puertas
    get() {
        return if(field > 0) field else 1
    }
}
data class Persona2(var name:String, val edad:Int, var colorOjos:String)

fun main(args: Array<String>){
    val auto = Auto("Ford", 9)

    auto.marca = "Toyota"

    println(auto.toString())
    println(auto.numPuertas)


    val mabel = Persona2("Mabel", 25, "verdes")

    val marla:Persona2 = mabel.copy("Marla")

    println(mabel.toString())
}
