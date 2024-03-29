package task2/*
Те же требования каршеренга, что и в задаче 5. 
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя. 
Определить доступно ли ему это авто или нет.
*/

fun main() {
    val age: Int = 28
    val experience: Int = 9
    val brand: String = "BMW"

    //вариант 1
    /*val carAvailable = when {
        age >= 26 && experience >= 6 -> "Доступен"
        age >= 21 && experience >= 2 && brand != "Audi" && brand != "BMW" -> "Доступен"
        else -> "Не доступен"
    }*/

    //вариант 2
    val carAvailable = checkAccess(age, experience, brand)

    println(carAvailable)
}

fun checkAccess(age: Int, exp: Int, brand: String): String {
    return if ((age >= 26 && exp >= 6) || (brand != "Audi" && brand != "BMW"))
        "Доступен"
    else
        "Не доступен"
}