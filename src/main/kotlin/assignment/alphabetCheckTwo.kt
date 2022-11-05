import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Enter here: ")
    val character = input.next().uppercase()[0]
    val brokenStrings = character.rangeTo(character)
    val all = 'A'..'Z'


    for (letter in brokenStrings) {
        if (all.contains(letter)) print("$letter is an alphabet.")
        else {
            print("$letter is not an alphabet.")
        }
    }
}