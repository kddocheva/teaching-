package two.generics

import kotlin.random.Random
import kotlin.random.nextInt

data class User(val nickname: String, val email: String, val age: Int)

interface DbProcessor<T> {

    fun saveObjectToDb(user: T)
}

class MySqlDbProcessor : DbProcessor<User> {
    override fun saveObjectToDb(user: User) {
        println("INSERT INTO users_table(${user.nickname}, ${user.email}, ${user.age})")
    }
}

class PostgresDbProcessor : DbProcessor<User> {
    override fun saveObjectToDb(user: User) {
        println("INSERT INTO users_table(nickname, email, age) VALUES (${user.nickname}, ${user.email}, ${user.age})")
    }
}

fun generateUsers(nicknames: List<String>): List<User> {
    return nicknames.map { User(it, "$it@gmail.com", Random.nextInt(1..90)) }
}

fun main() {
    val nicknames = listOf("Sparky", "Moonlight", "Whisper", "SunnyDaze", "MidnightRider", "VelvetThunder", "StarGazer", "JazzHands", "ChocoLover", "EchoDream")
    val users = generateUsers(nicknames)
    val userDbs: List<DbProcessor<User>> = listOf(MySqlDbProcessor(), PostgresDbProcessor())
    users.forEach {
        user -> userDbs.forEach {
            it.saveObjectToDb(user)
        }
    }
}
