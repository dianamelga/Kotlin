fun main(args: Array<String>) {

    val arrA = intArrayOf(1,23,23,4,3,2,1)
    val listA = arrayListOf<String>("Hola", "Kotlin", "Java")

    val num = arrA[0]
    arrA[2] = 10

    val mutableList = mutableListOf(2,3,4,5,6,7)
    println(mutableList)
    mutableList.add(9)
    mutableList.add(2,10)
    mutableList[0] = 1
    println(mutableList)

    val map = mutableMapOf<String,Int>(Pair("Key", 20))
    map.put("Key2", 10)
    println(map)
}