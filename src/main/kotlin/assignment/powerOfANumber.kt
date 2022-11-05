import java.util.Scanner
import kotlin.math.pow

fun main () {
    val input = Scanner(System.`in`)
    print("Enter a number: ")
    val numberToBeRaised = input.nextInt()

    print("Enter the power: ")
    val power = input.nextInt()

    val result = numberToBeRaised.toDouble().pow(power)
    print(result.toInt())
}