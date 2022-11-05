import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("Enter a number: ")
    val firstNumber = input.nextInt()
    val secondNumber = input.nextInt()
    val thirdNumber = input.nextInt()

    val max = if (firstNumber > secondNumber) {
        if (firstNumber > thirdNumber) firstNumber
        else thirdNumber
    } else {
        if (secondNumber > thirdNumber) secondNumber
        else thirdNumber
    }
    print(max)


}