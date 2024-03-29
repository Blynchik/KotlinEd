package task2/*
Вывести для чисел от 1 до 5 их текстовое представление: 1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то вывести: «ошибка»
*/

fun main() {
    val number: Int = 3

    //с использованием if (не лучший вариант в данном случае)
/*    val result = if (number == 1)
        "один"
    else if (number == 2)
        "два"
    else if (number == 2)
        "три"
    else if (number == 2)
        "четыре"
    else if (number == 2)
        "пять"
    else
        "ошибка"*/

    //с использованием when 1 вариант
/*    val result: String = when {
        number == 1 -> "один"
        number == 2 -> "два"
        number == 3 -> "три"
        number == 4 -> "четыре"
        number == 5 -> "пять"
        else -> "ошибка"
    }*/

    //с использованием when 2 вариант - самый удачный в данном случае
    val result: String = getSpelling(number)

    println(result)
}

fun getSpelling(num: Int): String {
    return when (num) {
        1 -> "один"
        2 -> "два"
        3 -> "три"
        4 -> "четыре"
        5 -> "пять"
        else -> "ошибка"
    }
}