package two.collections.maps

fun main() {
    maps()
    homework()
}

fun maps() {
    // Creating an empty HashMap
    val modifiedMap: HashMap<String, Int> = HashMap()
    modifiedMap["BMW"] = 5
    modifiedMap["Audi"] = 10
    modifiedMap["Toyota"] = 7
    // Accessing elements in the HashMap
    println("Number of BMW: ${modifiedMap["BMW"]}")
    println("Number of Audi: ${modifiedMap["Audi"]}")
    println("Number of Toyota: ${modifiedMap["Toyota"]}")

    // Initializing a HashMap with values
    val fruitsMap = hashMapOf(
        "apple" to 3,
        "banana" to 5,
        "orange" to 2
    )


    // Iterating over key-value pairs
    printMap(modifiedMap)
    printMap(fruitsMap)

    printMapFunctional(modifiedMap)
    printMapFunctional(fruitsMap)

    // Deleting element
    modifiedMap.remove("BMW")
    modifiedMap.remove("Audi")
    printMapFunctional(modifiedMap)
    println("Does map contain Key BMW? ${modifiedMap.containsKey("BMW")}")
    println("Does map contain Key Toyota? ${modifiedMap.containsKey("Toyota")}")
    println("Get of BMW ${modifiedMap.getOrDefault("BMW", 0)}")
    println("Get of Toyota ${modifiedMap.getOrDefault("Toyota", 0)}")
}

fun printMap(map: Map<String, Int>) {
    println("\n-----------------------------------")
    for ((key, value) in map) {
        println("$key has value $value")
    }
    println("___________________________________\n")
}

fun printMapFunctional(map: Map<String, Int>) {
    println("\n-----------------------------------")
    map.forEach { (key, value) -> println("$key has value $value")}
    println("___________________________________\n")
}
fun homework() {
    val myMap = hashMapOf<String, Int>(
        "1" to 1,
        "2" to 2,
        "3" to 3,
        "4" to 4
    )
}

fun mapMap(map: Map<String, Int>) {
    map.map {
        TODO("Map elements and change Key from String to Int, change Int to String")
    }
    // return Map(1 to "1", 2 to "2, 3 to "3", 4 to "4")
}

fun mapMapKeys(map: Map<String, Int>) {
    map.mapKeys {
        TODO("Map keys and change it's type from String to Int")
    }
    // return Map(1 to 1, 2 to 2, 3 to 3, 4 to 4)
}

fun mapMapValues(map: Map<String, Int>) {
    map.mapValues {
        TODO("Map values and change it's type from Int to String")
    }
    // return Map("1" to "1", "2" to "2", "3" to "3", "4" to "4"O
}
