package task5

import lesson10.SampleUser

fun main() {
    val user1 = User("вася")
    val user2 = User("гоша")
    val user3 = User("петя")
    val user4 = User("коля")
    val users = listOf(user1, user2, user3, user4)
    println(convertToStrings(users) { it.toString() })
    println(containsElement(users) { users.contains(User("степан")) })
    println(elementsCount(users) { it.name[0] == ('п') })
}

data class User(val name: String)

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String> {
    val strings = mutableListOf<String>()
    for (user in users) {
        strings.add(conversion(user))
    }
    return strings
}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    var isContains = false
    for (user in users) {
        if (condition(user)) {
            isContains = true
        }
    }
    return isContains
}

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int {
    var count = 0;
    for (user in users) {
        if (condition(user)) {
            count++
        }
    }
    return count
}