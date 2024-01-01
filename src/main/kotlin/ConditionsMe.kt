fun main() {
    println("What's your name?")
    val name = readLine() ?: " "
    // using the Elvis operator for null safety
    // The way Kotlin handles nullability. The readLine() function returns a nullable "String?" (it can be null),
    // but your whoIsThis function expects a non-nullable "String". When you try to pass the result of readLine()
    // directly to whoIsThis, Kotlin detects a type mismatch because it can't guarantee that the value won't be null.
    println(whoIsThis(name))

    println("How old are you, $name?")
    val age = readLine()
    //val age = ageInput?.toIntOrNull()
    // the "?" - call the toIntOrNull() method on ageInput only if ageInput is not null.
    // readLine returns a "String?" which means I need to convert the String to Int to match the type of howOld, which is an Int.
    println(howOld(age, name))
    // without the println here there will be no output
}

fun whoIsThis(name: String): String {
    return if (name.equals("Kristina")) {
        "Welcome, $name!"
    } else if (name == " ") {      // different way to compare values
        "Bye!"
    } else {
        "Bye, $name!"
    }
}
fun howOld(age: String?, name:String): String {
    // if I have nullable type like "String?", I need to handle null in the condition as well
    return if (age.equals("21")  && age != null) {
        "Perfect! Welcome to the Matrix, $name"
    } else {
        "Bye!"
    }
}
