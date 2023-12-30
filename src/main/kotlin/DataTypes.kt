
fun main(args: Array<String>) {
    println("Hello World!")
    // Calling the dataTypes function
    dataTypes()
    println("Result of add(5,10) = ${add(5, 10)}")
}


/**
 * DataTypes and void function
 */
fun dataTypes() {
    // Immutable variable Double (cannot be changed)
    val pi: Double = 3.14
    println("Double = $pi")

    // Mutable variable  Integer (can be changed)
    var counter: Int = 0
    println("Mutable Integer = $counter")
    counter += 1
    println("Mutated Integer = $counter")

    // String
    val message: String = "Hello, Kotlin!"
    println("String = $message")

    // Boolean
    val condition: Boolean = true
    println("Boolean = $condition")

    // Char
    val myLetter = 'D'
    println("Character = $myLetter")
}

/**
 * Functions with return
 */
fun add(a: Int, b: Int): Int {
    return a + b
}

