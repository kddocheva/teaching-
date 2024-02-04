package two.objects

import two.objects.data.Animal
import two.objects.data.Cat
import two.objects.data.Dog


val animals: List<Animal> = listOf(
    Dog("Barney", 15),
    Cat("Robin", 2),
    Dog("Samson", 4),
    Cat("Chuck", 1),
    Dog("Kamran", 21)
)

fun main() {
    polymorphism(animals)
    println(onlyDogs(animals))
    println(onlyCats(animals))
}

fun polymorphism(animals: List<Animal>) {
    animals.forEach {
        println(it.details())
    }
}

fun onlyDogs(animals: List<Animal>): List<Dog> {
    return animals.filterIsInstance<Dog>()
}
fun onlyCats(animals: List<Animal>): List<Cat> {
    return animals.filterIsInstance<Cat>()
}