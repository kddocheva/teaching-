package companion

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    usingObject()
    usingCompanionObject()
}

fun usingObject() {
    val service = Service(1.5)
    println("Current temperature = ${service.temperature()}")

}

fun usingCompanionObject() {
    println("Current temperature from companion = ${CompanionService.temperature()}")
}



class Service(private val mutator: Double) {

    fun temperature(): Double {
        return Random.nextInt(-20..40) * mutator
    }
}

class CompanionService {
    companion object {

        // CONST IS EVALUATED DURING COMPILATION AND REPLACED IN ALL OCCURRENCES
        private const val mutator = 1.5
        fun temperature(): Double {
            return Random.nextInt(-20..40) * mutator
        }
    }
}