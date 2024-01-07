package collections

import kotlin.random.Random
import kotlin.random.nextInt


val users = listOf("Artur", "Kate", "Barbra", "Artur", "Tyler", "Jason", "Kate")
val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

fun main () {
    nestedList()
    groupUsers()
    reducing()
    folding()
}

fun nestedList() {
    println("-----------Nested Lists-----------")
    val nestedList = listOf(listOf(1, 2, 3), listOf(4, 2, 1), listOf(10, 14, 21))
    println(nestedList)
    val list = nestedList.flatten()
    println(list)
    val listDistinct = list.distinct()
    println(listDistinct)
    val sortedList = listDistinct.sorted()
    println(sortedList)
    println("------------------------------")

}

fun groupUsers() {
    println("-----------Grouping-----------")
    val groupedUsers = grouping(users)
    println(groupedUsers)
    println("All Arturs = ${groupedUsers["Artur"]}")
    println("------------------------------")


}
fun grouping(names: List<String>): Map<String, List<User>> {
    return names.map { User(it, Random.nextInt(1..80)) }
        .groupBy { it.nickname }
}

fun reducing() {
    println("-----------Reducing-----------")

    val sum = numbers.sum()
    println("built-in sum = $sum")

    val sumAsReduction = numbers.reduce { acc, number -> acc + number }
    println("reduction sum = $sumAsReduction")
    // Function reference instead of lambda
    val sumAsReductionShort = numbers.reduce( Int::plus )
    println("reduction sum with Int operator = $sumAsReductionShort")
    val sumAsReductionOwn = numbers.reduce( ::adder )
    println("reduction sum with own function $sumAsReductionOwn")

    // Reversed order when compared to reduce
    val sumAsReductionRight = numbers.reduceRight { number, acc -> acc + number }
    println(sumAsReductionRight)
    println("------------------------------")
}

fun folding() {
    println("-----------Folding-----------")
    val sumAsRightFold = numbers.foldRight(0) { next, total ->
        println("total is $total, next is $next")
        total + next
    }
    println(sumAsRightFold)

    val foldRightUsers = users.foldRight("") { next, total -> "$total-$next" }
    println(foldRightUsers)
    println("------------------------------")
}

data class User(val nickname: String, val age: Int)

fun adder(a: Int, b: Int): Int {
    return a + b
}