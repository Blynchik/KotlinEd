package task2/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

//решение
fun main() {
    val number1: Int = 12
    val number2: Int = 8


//    можно так:
//    val result = if (number1 > number2)
//        "первое число больше"
//    else
//        if (number2 > number1)
//            "второе число больше"
//        else
//            "Числа равны"


//    или так с использованием when:
    val result: String = compareNums(number1, number2)

    println(result)
}

fun compareNums(num1: Int, num2: Int): String {
    return when {
        num1 > num2 -> "первое число больше"
        num2 > num1 -> "второе число больше"
        else -> "Числа равны"
    }
}