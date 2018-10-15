package ch3

// being able to do 1 to a or something like it is because of infix functions
// infix fun Any.to(other: Any) = Pair(this, other)
fun main(args: Array<String>) {
    val map = mapOf(
        1 to "one",
        7 to "seven",
        53 to "fifty-three"
    )

    val (number, name) = 1 to "one"

    println("$number: $name")
}