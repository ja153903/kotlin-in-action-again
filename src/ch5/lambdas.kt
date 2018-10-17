package ch5

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf(
        Person("Jaime", 24),
        Person("Jenny", 27),
        Person("Tim", 31))

    findTheOldest(people)

    println(people.maxBy{ it.age })
    println(people.maxBy(Person::age))

    println(people.joinToString { p: Person -> p.name })
}