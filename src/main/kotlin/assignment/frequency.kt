import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Enter a word here: ")
    var word = input.next()
    val firstList = IntArray(word.length)
    var arr = word.toCharArray()
    var count = 0
    for(l in word) {
        count++
    }

    var index = 0
    var nextIndex = 0

    for (index in firstList) {
        firstList[index] = 1
            for (nextIndex in firstList) {
                if (arr[index] == arr[nextIndex]) {
                    firstList[index] ++
                    arr[nextIndex] = 's'
                }

            }
    }

    for (i in firstList) {
        if (arr[nextIndex] != '0') print("${arr[index]} appeared ${firstList[index]} times.")
    }

}