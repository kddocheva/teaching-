package two.objects

import two.objects.data.Animal
import two.objects.data.ClosedDog
import two.objects.data.Dog


fun main() {
    inheritance()
    subtypesAndSupertypes()
}

fun inheritance() {
    val dog: Dog = Dog("Barney", 20)
    val animal: Animal = Dog("Barney", 20)
    println(dog.details())
    println(animal.details())
}

fun subtypesAndSupertypes() {

    // ClosedDog is subtype of Animal
    // Animal is supertype of ClosedDog
    val dog: ClosedDog = ClosedDog("A", 5)
    val dogAsAnimal: Animal = ClosedDog("A", 5)
    dog.inheritedMethod()
    // dogAsAnimal.inheritedMethod() -> does not work as only Animal's properties are visible
}