
fun main(args: Array<String>) {

    val n = 6
    when(n) {
        1, 2, 3 -> println("$n is a positive integer and is less than four!")
        0 -> println("$n is zero!")
        -1, -2, -3 -> println("$n is a negative integer and is less than four!")
    }

    val a = 90
    when(a) {
        in 1..10 -> println("$a is a positive integer and is less than 11!")
        in 10..100 -> println("$a is a positive integer between 10 and 100!")
    }
}