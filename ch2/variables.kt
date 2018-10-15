// variables are declared with the val keyword
// you can allow type inferencing to determine type
// or you can explicitly write it
fun main(args: Array<String>) {
    // These are immutable variables
    val question = "What is your name?"
    val num: Int = 42

    // these are mutable variables
    var canChange: Boolean = true

    // However, if we have an array or some container,
    // we can have it such that they are immutable but what
    // it points to will be mutable
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
}
