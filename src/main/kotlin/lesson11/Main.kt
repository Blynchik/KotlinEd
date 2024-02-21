package lesson11


fun main() {
    val user1 = SampleUser("вася", 12)
    val user2 = SampleUser("гоша", 18)
    val user3 = SampleUser("петя", 29)
    val user4 = SampleUser("коля", 19)

    val users = listOf(user1, user2, user3, user4)
    val filteredUsersKotlinLib = users.filter { it.name[0] == 'к' }
    val maxAgeUser = users.maxBy { it.age }
    users.minBy { it.age }
    users.maxBy { it.name }
    users.sortedBy { it.name }
    users.sortedByDescending { it.name }
    println(maxAgeUser)

}

data class SampleUser(val name: String, val age: Int)