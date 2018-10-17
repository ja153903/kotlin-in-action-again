package ch5

fun printMessagesWithPrefix(
    messages: Collection<String>, prefix: String
) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
}

// a note with async functions.
/*
fun tryToCountButtonClicks(button: Button): Int {
    var clicks = 0
    button.onClick { clicks++ }
    return clicks // this would return 0
}

This would only return 0 because onClick needs to finish asynchronously
 */

