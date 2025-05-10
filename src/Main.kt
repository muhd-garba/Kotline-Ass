fun main() {
    // Print numbers 1 to 10
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        print("$i ")
    }

    println("\n") // Add some space between outputs

    // Print even numbers from 1 to 20
    println("Even numbers from 1 to 20:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}