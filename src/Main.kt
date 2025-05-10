class Car(val brand: String, val model: String, val year: Int) {
    fun displayDetails() {
        println("Car Details:")
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
        println()  // Add empty line for separation
    }
}

fun main() {
    // Create two Car objects
    val car1 = Car("Toyota", "Camry", 2022)
    val car2 = Car("Tesla", "Model S", 2023)

    // Display their details
    car1.displayDetails()
    car2.displayDetails()

    // You can create more cars and display them
    val car3 = Car("Ford", "Mustang", 1969)
    car3.displayDetails()
}