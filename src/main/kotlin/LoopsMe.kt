fun main() {
    myFirstLoop(30)
    mySecondLoop("I'm KDD")
    myForLoop()
    myForLoopTwo()
}

fun myFirstLoop(limit: Int) {
    var num = 0
    while (num <= limit) {
        // println(num)
         // num = num + num
        // num = 0 + 0 ; which leads to an infinite loop
         num ++
    }
}

fun mySecondLoop(s: String) {
    var num = 0
    while (num <= 10) {
        println(s)
        num ++
    }
}

fun myForLoop() {
    for (num in 0..10) {
        println("I'm for loop $num")
    }
}

fun myForLoopTwo() {
    for (num in 0..15 step 3) {
        println("Every 3th number from the list: $num")
    }
}