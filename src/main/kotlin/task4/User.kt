package task4

import lesson8.User
import task3.Car

data class User(val name: String, val age: Int, val exp: Int)

fun avgAge(users: List<User>): Int {
    var sum = 0
    for (user in users) {
        sum += user.age
    }
    return sum / users.size
}

fun getYoungest(users: List<User>): User {
    var youngest = users[0]
    for (user in users) {
        if (user.age < youngest.age) {
            youngest = user;
        }
    }
    return youngest
}

fun availableCars(user: task3.User, cars: List<Car>): List<Car> {
    var checkCars = mutableListOf<Car>()
    for (car in cars) {
        when {
            user.age >= 26 && user.exp >= 6 -> checkCars.add(car)
            user.age >= 21 && user.exp >= 2 -> if (!car.brand.equals("BMW") && !car.brand.equals("Audi")) {
                checkCars.add(car)
            }
        }
    }
    return checkCars;
}


fun main() {
    val users = listOf(User("Вася", 15), User("Коля", 18), User("Петя", 10))
    println(avgAge(users))
    println(getYoungest(users))
    println(availableCars(task3.User("Саня", 26, 6), mutableListOf(Car("BMW", 50), Car("Audi", 60), Car("Жигули", 20))))
}
