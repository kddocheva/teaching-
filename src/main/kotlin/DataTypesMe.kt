    // why the Array ?
fun main(args: Array<String>) {
    println("Hey World!")
    println("Result of add(5,10) = ${add(5, 10)}")
    // example 0
    val answer: String= "Yes, it's really awesome!"
    println("This is awesome,no? ${answer}")
    // example 1
    val numOne: Int = 19
    val numTwo: Int = 7
    println(numOne)
    println(numOne + numTwo)
    println("Number one is ${numOne} and number two is ${numTwo}. Sum of the two numbers is: ${numOne + numTwo}")
    // example 2
    val number: Double = 19.9
    println(number)
    //example 3
    var magicNumber: Int = 7
    magicNumber = magicNumber + 1
    println(magicNumber)
    // example 4
    val isTrue: Boolean = true
    val isFalse: Boolean = false
    println("Is this the truth? $isTrue")
    // example 5
    // Why there is no Type here ? I would think I need to add a type String
    // val randomThing: String = 'K'
    val randomThing = 'K'
    println(randomThing)




}