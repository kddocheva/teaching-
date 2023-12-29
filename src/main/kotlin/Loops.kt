
fun main() {
    whileLoop(3)
    forLoop(3)
}

fun whileLoop(upperRange: Int) {
    var i = 0
    while (i < upperRange) {
        println("While loop = $i")
        i++
    }
}

fun forLoop(upperRange: Int) {
    for (num in 0..upperRange) {
        println("For loop $num")
    }

    for (num in 0..upperRange step 2) {
        println("For loop with step 2 =  $num")
    }
}
