import java.io.File

fun main() {
    val people = readFile()
    people.forEach {
        println(it)
    }
//    val avAge = avAge(people);
//    println("Av. age = $avAge")
}

fun readFile():List<Person> {
    val filePath = "people.csv"

    val people = File(filePath).readLines().map { lines ->
            lines.split(",")
        }.map {
            tokens -> Person(name = tokens[0], age = 20, gender = tokens[2], occupation = tokens[3], city = tokens[4])
        }
    return people
}

fun avAge(people: List<Person>): Double {
    TODO("calculate av. age for people")
}
