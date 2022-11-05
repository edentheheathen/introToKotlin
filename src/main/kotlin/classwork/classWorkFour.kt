fun main() {
    println("Enter a letter: ")
    val letter = readLine()
    if (letter != null) {
        when (letter.uppercase()) {
            "A", "E", "I", "O", "U" -> println("The letter $letter is a vowel.")
            else -> println("The letter $letter is a consonant.")
        }
    }
}