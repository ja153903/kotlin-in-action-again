package ch4

// in Kotlin, there are typically several methods you want to override
// toString(), equals(), and hashCode()

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String {
        return "Client(name=$name, postalCode=$postalCode)"
    }

    override fun equals(other: Any?): Boolean {
        // using is is like using instanceof() in java
        if (other == null || other !is Client) {
            return false
        }

        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        // values in a hashset are compared first by their hashcode and then
        // by their value
        // this makes sense because objects that are equal will have the
        // same hashcode

        // some hash function
        return name.hashCode() * 31 + postalCode
    }
}

fun main(args: Array<String>) {
    val client1 = Client("Jaime", 123)
    println(client1)

    val client2 = Client("Jaime", 123)

    println(client1 == client2)
}

