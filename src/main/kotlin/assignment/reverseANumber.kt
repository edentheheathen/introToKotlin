import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("Enter five numbers here: ")
    val firstNumber = input.nextInt()
    val secondNumber = input.nextInt()
    val thirdNumber = input.nextInt()
    val fourthNumber = input.nextInt()
    val fifthNumber = input.nextInt()

    val list = listOf<Int>(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber)
    print(list.reversed())
}