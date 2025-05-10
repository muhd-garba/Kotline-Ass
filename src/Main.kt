fun main() {
    // Lambda expression that takes two Ints and returns their product
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    // Using the lambda
    val result1 = multiply(5, 7)
    val result2 = multiply(10, 3)
    val result3 = multiply(-4, 6)

    println("5 * 7 = $result1")
    println("10 * 3 = $result2")
    println("-4 * 6 = $result3")

    // You can also call it directly in println
    println("\n8 * 9 = ${multiply(8, 9)}")
}