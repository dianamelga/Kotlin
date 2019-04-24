fun <T> MutableList<T>.swap(index1:Int, index2:Int) {
    val tmp = this.get(index1)
    this[index1] = this[index2]
    this[index2] = tmp
}

infix fun Int.multiply(a:Int) :Int {
    return this * a
}
fun main(args: Array<String>) {

    println(4.multiply(4))
}