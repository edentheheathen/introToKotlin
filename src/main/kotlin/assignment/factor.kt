import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("Enter number here: ")
    val number = input.nextInt()

    for (num in 1.. number) {
        if (number % num == 0) {
            print(num)
            println()
        }
    }
}