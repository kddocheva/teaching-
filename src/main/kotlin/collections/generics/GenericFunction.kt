package two.generics


fun main() {
    val intSquare = square(5)
    val doubleSquare = square(3.14)

    println("Square of 5: $intSquare")
    println("Square of 3.14: $doubleSquare")
}

fun <T : Number> square(value: T): Double {
    return value.toDouble() + value.toDouble()
}

