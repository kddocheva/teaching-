
fun main(args: Array<String>) {
    println("Absolute of 5 = ${abs(5)}")
    println("Absolute of -5 = ${abs(-5)}")
    println("Tuesday is a = ${isItWeekend("Tuesday")}")
    println("Saturday is a = ${isItWeekend("Saturday")}")

}

/**
 * Conditionals
 */

fun abs(a: Int): Int {
    // fun abs(a: Int): Int = if (a > 0) a else -a
    return if (a > 0) {
        a
    } else {
        -a
        // -a gives the opposite of a
    }
}

/**
 * Pattern matching
 */
fun isItWeekend(day: String): String {
    return when (day) {
        "Monday" -> "It's the start of the week"
        "Friday", "Saturday" -> "It's the weekend"
        else -> "It's a regular day"
    }
}
