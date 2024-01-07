fun main() {
    collection()
    new()
    names()
    map()
}

fun collection() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val numbersWithLetters = mapOf("one" to 1, "two" to 2)

    println(numbers[0])
    println(numbersWithLetters["one"])
    println(numbersWithLetters)
}

fun new() {
    val list = listOf(1,2,3,4,5,6,7,8,9)
//        .filter{ it > 3}
        .forEach{println(it)}
}

fun names() {
    val names = listOf("Kristina", "Docheva", "Arianna", "Artur", "Stefano")

    names.forEach{
        // single '' and not ""
        if (it.last().equals('a')) {
            println("Name is Female")
        } else {
            println("Name is Male")
        }
    }
}

fun map() {
    val name = "Kristina"
    (1..10)
            // pass the Student class as a param
        .map {Student(name, it)}
        .forEach { println(it)}
}