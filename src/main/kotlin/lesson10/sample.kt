package lesson10

import lesson8.User

fun main() {
    val user1 = SampleUser("вася", 12)
    val user2 = SampleUser("гоша", 18)
    val user3 = SampleUser("петя", 29)
    val user4 = SampleUser("коля", 19)

    val users = listOf(user1, user2, user3, user4)

    val filteredUsers = filterUserByAge(users)
    println(filteredUsers)

    val filteredUsersByCondition = filterUserByCondition(users, ::conditionAgeMore18)
    println(filteredUsersByCondition)

    val lambda = { user: SampleUser -> user.age > 10 }
    println(filterUserByCondition(users, lambda))
    println(filterUserByCondition(users, { user: SampleUser -> user.age > 10 }))
    println(filterUserByCondition(users, { user -> user.age > 10 }))
    println(filterUserByCondition(users, { it -> it.age > 10 }))
    println(filterUserByCondition(users, { it.age > 10 }))
    println(filterUserByCondition(users) { it.age > 10 }) //если последний параметр лямбда
    //filterUserByCondition{it.age > 10} возможно, если передается только лямбда без других параметров

    val filteredUsersKotlinLib = users.filter { it.name[0] == 'к' }
}

fun filterUserByAge(users: List<SampleUser>): List<SampleUser> {
    val filteredUsers = mutableListOf<SampleUser>()
    for (user in users) {
        if (user.age > 18) {
            filteredUsers.add(user)
        }
    }
    return filteredUsers
}

fun conditionAgeMore18(user: SampleUser): Boolean {
    return if (user.age > 18) true else false
}

fun filterUserByCondition(users: List<SampleUser>, condition: (SampleUser) -> Boolean): List<SampleUser> {
    val filteredUsers = mutableListOf<SampleUser>()
    for (user in users) {
        if (condition(user)) {
            filteredUsers.add(user)
        }
    }
    return filteredUsers
}

data class SampleUser(val name: String, val age: Int)