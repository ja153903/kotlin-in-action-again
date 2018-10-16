package ch4

// in Kotlin, you can say that you're delegating the implementation
// of an interface to another object, using the by keyword

// Instead of having to implement all the Collection<T> overrides
// we have the innerList take care of it
// That way we really only have to override functions if we
// want to override more functions
class DelegatingCollection<T>(
    innerList: Collection<T> = ArrayList<T>()): Collection<T> by innerList
{}

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()): MutableCollection<T> by innerSet
{
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}