package ch2;

class Person(val name: String, val isMarried: Boolean)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        // property getter declaration
        get() = height == width
}

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    val rectangle = Rectangle(41, 41)
    println(rectangle.isSquare)
}