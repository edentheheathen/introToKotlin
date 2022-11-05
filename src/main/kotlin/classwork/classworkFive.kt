fun main(args: Array<String>) {
    var number = 1
    var sum = 0
    while (number <= 100) {
        sum += number
        number++
    }
    println(sum)

    var newNumber = 1
    var sumResult = 0

    do {
        sumResult += newNumber
        newNumber++
    } while (newNumber <= 100)
    println(sumResult)

    var summ = 0
    var num : Int
    while (true) {
        print("Enter a number: ")
        num = readLine()!!.toInt()
        if (num == 0)
            break
        summ += num
        print("Sum: $summ")
    }
}