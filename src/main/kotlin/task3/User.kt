package task3

data class User(val name: String, val age: Int, val exp: Int)

data class Car(val brand: String, val rent: Int)

fun checkCustomer(user: User): String {
    return when {
        user.age >= 26 && user.exp >= 6 -> "Доступны все авто"
        user.age >= 21 && user.exp >= 2 -> "Доступны все авто кроме Audi и BMW"
        else -> "Услуги каршеринга недоступны"
    }
}

fun checkAccess(car: Car, user: User): String {
    return if ((user.age >= 26 && user.exp >= 6) || (car.brand != "Audi" && car.brand != "BMW"))
        "Доступен"
    else
        "Не доступен"
}
