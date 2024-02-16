package lesson8

fun main() {
    val user1 = User("Петя", 30)
    val user2 = User("Анна", 18)
    println("${user1.name} ${user1.age}")

    val userName1 = "Кирилл"
    val userAge1 = 23

    val userName2 = "Ольга"
    val userAge2 = 35

    val maxAgeUser = getMaxAgeUser(user1,  user2)
    println(maxAgeUser)
}

fun getMaxAgeUser(user1: User, user2: User) : User {
    return if (user1.age > user2.age) {
        user1
    } else {
        user2
    }
}

data class  User(val name: String , val age: Int)