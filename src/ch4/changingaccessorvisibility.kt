package ch4

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        for (w in word) counter++
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}