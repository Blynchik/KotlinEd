package lesson7

fun main() {
    val a: Int = 3
    val b: Int = 10

    val maxNum: Int = getMaxNum(a, b)

    println(maxNum)
}

fun getMaxNum(firstNum: Int, secondNum: Int): Int {
    val result = if(firstNum > secondNum)
        firstNum
    else
        secondNum
    return result
}