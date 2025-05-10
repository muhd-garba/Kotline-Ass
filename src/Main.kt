fun main() {
    // Create a map of students and their scores
    val studentScores = mapOf(
        "Muhammad" to 85,
        "Aisha" to 72,
        "Fatima" to 68,
        "Garba" to 90,
        "Ahmed" to 65,
        "Ali" to 75
    )

    println("Students who scored above 70:")
    println("----------------------------")

    // Filter and print students with scores > 70
    studentScores.forEach { (name, score) ->
        if (score > 70) {
            println("$name: $score")
        }
    }
}