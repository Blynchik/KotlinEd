package task1

/* Вывести на экран большее из двух целых чисел. */

fun main(){
    print("Введите первое число: ")
    val num1: Int = readln().toInt()

    print("Введите второе число: ")
    val num2: Int = readln().toInt()

    println("Самое большое число: ${Math.max(num1, num2)}")
}