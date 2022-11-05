import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("Enter any year here: ")
    val year = input.nextInt()
    if(year % 4 == 0) println("$year is a leap year.")
    else println("$year is not a leap year.")
}