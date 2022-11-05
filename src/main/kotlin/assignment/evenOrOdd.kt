import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Input numbers here: ")
    val number = input.nextInt()

    if (number % 2 == 0) {
        println("$number is an even number.")
    } else {
        println("$number is an odd number.")

    }
}