fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name")

    val programmingLanguages = arrayListOf<String>()
    programmingLanguages.add("Java")
    programmingLanguages.add("Kotlin")
    programmingLanguages.add("C++")

    for (language in programmingLanguages) {
        println("I know how to code in ${language}")
    }
}