import java.io.File

fun main() {
    val people = readFile()
    val avAge = avAge(people);
    println("Av. age = $avAge")
}

fun readFile():List<Person> {
    val filePath = "people.csv"

    val people = File(filePath).readLines()
        .map { lines ->
            lines.split(",")
        }.map {
            tokens -> Person(name = tokens[0], age = tokens[1].toIntOrNull() ?: 0, gender = tokens[2], occupation = tokens[3], city = tokens[4])
        }.drop(1)
    return people
}

fun avAge(people: List<Person>): Double {
    return people.map { it.age }
        .average()
}
