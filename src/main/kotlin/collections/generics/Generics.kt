package two.generics


fun main() {
    printItem("Hello, Generics!")   // String
    printItem(42)                   // Int
    printItem(3.14)                 // Double
}

// Generic functions
fun <T> printItem(item: T) {
    println("Adding item to database: $item")
}

