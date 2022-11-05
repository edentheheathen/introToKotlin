import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter a character here: ")
    val letter = input.next()
    val conv = letter[0]
    val upperCase = 'A'..'Z'
    val lowerCase = 'a'..'z'

    if (letter == letter.uppercase()) {
        for (anAlphabet in upperCase) {
            if (anAlphabet.code == conv.code) print("$letter's ASCII value is ${anAlphabet.code}")
        }
    } else {
        for (anAlphabet in lowerCase) {
            if (anAlphabet.code == conv.code) print("$letter's ASCII value is ${anAlphabet.code}")
        }
    }
    if (!upperCase.contains(conv) && !lowerCase.contains(conv)) {
        print("$letter is not alphabet so it cannot have an ASCII value.")
    }
}

