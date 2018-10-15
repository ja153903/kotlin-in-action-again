fun fizzbuzz(i: Int) = 
    when {
        i % 15 == 0 -> "Fizzbuzz "
        i % 5 == 0 -> "Fizz "
        i % 3 == 0 -> "Buzz "
        else -> "$i "
    }

fun main(args: Array<String>) {
    // val oneToTen = 1..10
    // ranges are closed
    // for (i in oneToTen) { println(i) }
    for (i in 1..100) {
        print(fizzbuzz((i)))
    }
    println()

    for (i in 100 downTo 1 step 2) {
        print(fizzbuzz(i))
    }
}