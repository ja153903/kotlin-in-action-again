package ch3

var opCount = 0

fun performOp() = opCount++

fun reportOpCount() = 
    println("Operation performed $opCount times")

fun main(args: Array<String>) {
    for (i in 1..10) {
        performOp()
    }
    reportOpCount()
}