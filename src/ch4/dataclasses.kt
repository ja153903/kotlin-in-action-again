package ch4

// you dont have to generate toString, equals, hashCode yourself
// if you decide to use data classes

// However, we should probably only use these
// if you don't need a custom implementation
data class ClientDS(val name: String, val postalCode: Int)

// You don't really need them to be val but if you want to use
// the class as a key of a map or something you want to make
// sure that your keys are immutable

fun main(args: Array<String>) {
    val c1 = ClientDS("Jaime", 123)
    println(c1)
}