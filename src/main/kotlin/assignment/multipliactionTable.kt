import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("Start: ")
    val firstNumber = input.nextInt()
    print("End: ")
    val secondNumber = input.nextInt()

    var product = 0

    for (number in 1.. secondNumber) {
        product = firstNumber * number
        print("$firstNumber x $number = $product")
        println()
    }

}