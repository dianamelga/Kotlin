fun type(dato:Any){
    when(dato) {
        is String -> println(dato.length)
        is Int -> print("${dato * 2}")
        is Boolean -> println("Es un booleano $dato")
        is Persona2 -> println("${dato.name}  ${dato.edad}")
        else-> println("No se que objeto es")
    }
}

fun whoIs(who:Persona2) =
    when(who.name) {
        "Mabel" -> "Puedes abrir la puerta"
        "Darla" -> "Puedes abrir la puerta"
        else -> "No lo dejes entrar"
    }

fun main(args:Array<String>) {
    type(Persona2("Diana", 20, "cafes"))
    println(whoIs(Persona2("Diana", 20, "cafes")))
}