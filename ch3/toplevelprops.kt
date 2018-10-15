package top

var opCount = 0

fun performOps() { opCount++ }

fun reportOpCount() { 
    println("Operation performed $opCount times")
}
