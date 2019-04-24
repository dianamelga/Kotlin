fun main(args:Array<String>) {

    var a = "abc"

    var b:String? = "abc"
    b = null

    val l1 = a.length
    val l2 = b?.length ?: 0

    println(l1)
    println(l2)
}

