package ch3

import strings.lastChar
import strings.joinToString

fun main(args: Array<String>) {
    val c = "Kotlin".lastChar()
    println(c)

    val list = listOf("jaime", "abbariao")
    println(list.joinToString())

}