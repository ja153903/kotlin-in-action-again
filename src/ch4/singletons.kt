package ch4

data class Person(val name: String, val hourly: Double, val hoursWorked: Int)

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            // ...
        }
    }
}

// This is typically useful when your class doesn't have any state
// it should be an object instead

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("Jaime", 45.0, 40))
}