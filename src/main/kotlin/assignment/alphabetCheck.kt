import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Enter a word here: ")
    val character = input.next().uppercase()
    val list = arrayListOf<Char>()
    var count = 0
    val all = 'A'..'Z'
    val isAnAlphabet = arrayListOf<Char>()
    val isnNotAnAlphabet = arrayListOf<Char>()

    for (aLetter in character) {
        list.add(aLetter)
    }
    for (aChar in list) {
        if (all.contains(aChar)) {
            isAnAlphabet.add(aChar)
            count++
            println("$isAnAlphabet are alphabets.")
        } else {
            isnNotAnAlphabet.add(aChar)
            println("The words $isnNotAnAlphabet in $character are not alphabets.")
        }
    }
}

