package ch4

class Jaime(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value"
            """.trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val user = Jaime("Alice")
    user.address = "67-40 Booth Street"
}