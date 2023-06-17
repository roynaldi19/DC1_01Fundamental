package `09Arrays`

fun main() {
    val intArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    intArray[2] = 11

    println(intArray[2])
    println()

    for (i in intArray){
        println(i)
    }
}