fun main () {
    val firstName = "Eden"
    var lastName = "Elenwoke"

    var length = if (firstName.length > lastName.length) {
        println("$firstName has ${firstName.length} characters!")
        firstName.length
    }  else {
        println("$lastName has ${lastName.length} characters!")
        lastName.length
    }
    println(length)
}