package nulls

import kotlin.random.Random

fun main() {
    var nullableString: String? = "Hello"
    var nonNullableString: String = "Hello"  // OK
    //    var anotherString: String = null      // Compilation error: Null cannot be a value of a non-null type String
    //    nullableString.length                 // Compilation error
    val length: Int? = nullableString?.length

    nullableString?.let {
        // Code inside this block will only be executed if nullableString is non-null
        println("String length: ${it.length}")
    }

    val stringOrNull = stringOrNull()
    stringOrNull?.let {
        println("String content $it")
        "hey"
    }
}

fun stringOrNull(): String? {
    return if (Random.nextDouble() > 0.5) {
       "Larger than 0.5"
    } else {
        null
    }
}