fun main(args: Array<String>) {

    val srt = "Una cadena de String normal"

    val nombre = "Mabel"
    val edad = 25

    val sentencia:String = "Ella es $nombre y tiene $edad anhos"

    println(sentencia)

    val cumpl = "$nombre cumple ${edad+1} anhos"

    println(cumpl)


    val text = """
        Este es un string que quiero imprimir es demasiado largo
        y tiene varios renglones que
        mostrarse

    """.trimIndent()
    println(text)
}