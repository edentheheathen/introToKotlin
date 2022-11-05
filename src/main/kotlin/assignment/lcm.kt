import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("Enter first number here: ")
    var firstNumber = input.nextInt()

    print("Enter second number here: ")
    var secondNumber = input.nextInt()

    while (firstNumber == 0 && secondNumber == 0) {

        print("Enter first number here: ")
        firstNumber = input.nextInt()

        print("Enter second number here: ")
        secondNumber = input.nextInt()
    }
    var max = if (firstNumber > secondNumber) firstNumber
    else secondNumber

    while (true) {
        if ((max % firstNumber == 0) && (max % secondNumber == 0)) {
            print("The LCM of $firstNumber and $secondNumber is $max.")
            break
        } else ++max
    }


}