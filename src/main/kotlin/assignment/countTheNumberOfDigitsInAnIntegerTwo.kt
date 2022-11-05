import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    var count = 0
    print("Input numbers here: ")
    val digits = input.next()

    for (aDigit in digits) {
        count++
    }
    print(count)
}