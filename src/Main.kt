fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // Test cases
    val result1 = sum(5, 3)
    val result2 = sum(-2, 7)
    val result3 = sum(0, 0)
    val result4 = sum(100, 250)

    println("5 + 3 = $result1")
    println("-2 + 7 = $result2")
    println("0 + 0 = $result3")
    println("100 + 250 = $result4")

    // You can also call it directly in println
    println("\n15 + 25 = ${sum(15, 25)}")
}