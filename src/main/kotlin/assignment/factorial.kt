import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    var factorial = 1

    print("Enter number here: ")
    val number = input.nextInt()

    for (num in number downTo 1) {
       factorial *= num
    }
    print(factorial)
}