fun main () {
    first@ for (i in 1.. 4) {
        second@ for (j in 1.. 2) {
            println("i: $i; j: $j")
            if (i == 2) break@first
        }
    }
}