package lesson6

fun main() {
    val number1: Int = 12
    val number2: Int = 23
    val number3: Int = 8

    if (number1 > number2 && number1 > number3)
        println(number1)
    else if (number2 > number1 && number2 > number3)
        println(number2)
    else
        println(number3)

    val rating: Int = 3
    val condition1: Boolean = !(rating == 1) || rating != 2

    if (rating == 1 || rating == 2)
        println("плохо")
    else if (rating == 3)
        println("нормально")
    else if (rating == 4)
        println("хорошо")
    else if (rating == 4)
        println("отлично")

    when (rating) {
        1, 2 -> println("плохо")
        3 -> println("нормально")
        4 -> println("хорошо")
        5 -> println("отлично")
    }

    when {
        rating == 1 || rating == 2 -> println("плохо")
        rating == 3 -> println("нормально")
        rating == 4 -> println("хорошо")
        rating == 5 -> println("отлично")
    }
}