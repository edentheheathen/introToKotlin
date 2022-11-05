fun main (args: Array<String>) {
    var language = arrayOf("Ruby", "Kotlin", "Java")
    for(anItem in language.indices) {
        if (anItem%2 == 0) print(language[anItem])
    }
}