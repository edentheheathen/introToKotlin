fun main () {
    val names = arrayOf("Eden", "Love", "Mofe")
    if("Seyi" in names) {
        println("Yhup!")
    } else {
        println("Nope!")
    }

    print("Enter a text")
    val input= readLine()!!
    println("You entered $input")
}