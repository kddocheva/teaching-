
fun main() {
    collections()
    filters()
    maps()
}

fun collections() {
    // List
    val numbers = listOf(1, 2, 3, 4, 5)

    // Map
    val map = mapOf("one" to 1, "two" to 2, "three" to 3)

    // Accessing elements
    println(numbers[0])
    println(map["two"])
    println(numbers)
    println(map)
}

fun filters() {
    listOf(1, 2, 3, 4, 5, 6)
        .filter{ it > 3 }
        .forEach{println(it)}
}

fun maps() {
    (1..6)
        .map { Student("Adam", it) }
        .forEach { println(it) }
}