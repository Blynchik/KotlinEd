package task1

/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.


На вход приходит возраст и стаж водителя. Вывести сообщение о том, может ли он пользоваться каршерингом
и какие авто ему доступны.
*/

fun main() {
    print("Введите возвраст: ")
    val age: Int = readln().toInt()

    print("Введите стаж: ")
    val exp: Int = readln().toInt()

    if (age < 21 || exp < 2) {
        println("Возраст меньше 21 года или недостаточно стажа")
    } else {
        println("Вам доступен каршеринг")
    }

    if (age >= 26 && exp >= 6) {
        println("Вам доступны дополнительно Audi и BMW")
    }
}