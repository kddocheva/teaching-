package two.generics

fun main() {
    val stringBox = Box("Kotlin")
    val intBox = Box(42)
    val doubleBox = Box(3.14)

    println("String Box: ${stringBox.content}")
    println("Int Box: ${intBox.content}")
    println("Double Box: ${doubleBox.content}")
}

// Generic classes
class Box<T>(val content: T)

