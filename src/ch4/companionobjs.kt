package ch4

class A {
    companion object {
        fun bar() = println("Companion object called")
    }
}

fun main(args: Array<String>) {
    A.bar() // gives it a static feel
}

fun getFacebookName(accountId: Int): String = accountId.toString()

class UserComp(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            UserComp(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
            UserComp(getFacebookName(accountId))
    }
}

interface JSONFactor<T> {
    fun fromJSON(jsonText: String): T
}

class CompanionPerson(val name: String) {
    companion object: JSONFactor<CompanionPerson> {
        override fun fromJSON(jsonText: String): CompanionPerson {
            return CompanionPerson("Jaime")
        }
    }
}

fun CompanionPerson.Companion.someFunc() = println("Extension function here")

// we can also use objs to create anonymous inner classes

/*
window.addMouseListener(
    // anonymous object inherits mouseadapter and then overrides functions
    // this can also implement interfaces
    object: MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {}
        override fun mouseEntered(e: MouseEvent) {}
    }
)
 */