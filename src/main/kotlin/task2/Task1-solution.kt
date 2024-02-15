package task2/* Вывести на экран большее из двух целых чисел. */

//решение
fun main() {
    val number1: Int = 12
    val number2: Int = 8

    val max: Int = getMax(number1, number2)

    println(max)
}

fun getMax(a: Int, b: Int): Int {
    return if (a > b)
        a
    else
        b
}