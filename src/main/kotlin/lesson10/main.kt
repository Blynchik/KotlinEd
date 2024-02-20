package lesson10

fun main() {
    val lambda = { a: Int, b: Int -> if (a > b) a else b }

    println(lambda(6, 3))
}

fun max(a: Int, b: Int): Int {
    val result = if (a > b)
        a
    else
        b

    return result
}