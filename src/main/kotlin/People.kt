import java.io.File

fun main() {
    val people = readFile();
//    val avAge = avAge(people);
//    println("Av. age = $avAge")
}

fun readFile():List<Person> {
    val filePath = "people.csv"

    val people = File(filePath).useLines { lines ->
        lines.map {
            it.split(",")
        }.map {
            tokens -> Person(name = tokens[0], age = tokens[1].toInt(0), gender = tokens[2], occupation = tokens[3], city = tokens[4])
        }
    }
    people.forEach { println(it)}
    return listOf(Person(" ", 0, " ", " ", " ") )
}

fun avAge(people: List<Person>): Double {
    TODO("calculate av. age for people")
}
