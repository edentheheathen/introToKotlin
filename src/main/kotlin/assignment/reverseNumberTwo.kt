import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Enter a five digit number here: ")
    var digits = input.next()
    val list = arrayListOf<Char>()

    while (digits.length != 5) {
        print("Enter a five digit number here: ")
        digits = input.next()
        }
    for (aDigit in digits) {
        list.add(aDigit)
    }
    print(list.reversed())
}

