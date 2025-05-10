// Base class
open class Person(val name: String, val age: Int) {
    open fun printDetails() {
        println("Person Details:")
        println("Name: $name")
        println("Age: $age")
    }
}

// Subclass
class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    override fun printDetails() {
        super.printDetails()  // Call base class method
        println("Grade: $grade")
        println()  // Add empty line for separation
    }
}

fun main() {
    // Create Person and Student objects
    val person = Person("Muhammad Garba", 30)
    val student1 = Student("Alice Johnson", 18, "A")
    val student2 = Student("Bob Smith", 19, "B+")

    // Print their details
    person.printDetails()
    println("--------------------")
    student1.printDetails()
    student2.printDetails()
}