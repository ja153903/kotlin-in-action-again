package ch3

fun <T> bunchaValues(vararg values: T): List<T> {
    return listOf(*values)
}

fun main(args: Array<String>) {
    val list: List<Int> = bunchaValues(1, 2, 3, 4, 5)
    println(list)
}