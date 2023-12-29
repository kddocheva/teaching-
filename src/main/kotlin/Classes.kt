
fun main() {
    val person = Person("Artur", 10)
    println(person)
    println(person.name)
    println(person.age)
    val person2 = Person("Artur", 10)
    println (person == person2)


    val student = Student("Artur", 20)
    println(student)
    val student2 = Student("Artur", 20)
    println(student == student2)
}