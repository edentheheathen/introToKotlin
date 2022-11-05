fun main(){
    var firstNumber = 5
    var secondNumber = 10
    var sum = firstNumber + secondNumber
    var quotient = secondNumber / firstNumber
    var product = firstNumber * secondNumber
    var subtraction = secondNumber - firstNumber

    var maximum = if (secondNumber > firstNumber) {
        println("$secondNumber is obviously greater than $firstNumber")
        secondNumber
    } else {
        println("$firstNumber is less than $secondNumber")
        firstNumber
    }
    println("Max = $maximum")



//    println("The sum of $firstNumber and $secondNumber is $sum.")
//    println("The quotient of $secondNumber and $firstNumber is $quotient.")
//    println("The product of $firstNumber and $secondNumber is $product." )
//    println("The difference of $secondNumber and $firstNumber is $subtraction.")
}