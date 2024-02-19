package lesson9

fun main() {
    //неизменяемая
    val numbers: List<Int> = listOf(45, 87, 4, 216, 1)
    //изменяемая
    val mutable = mutableListOf(45,45,45,12,54)
    mutable.add(1)
    mutable.remove(45)
    mutable.removeAt(0)
    var counter = 0

    for (number in numbers) {
        val temp = 21
        if (number > 10) {
            println(number)
            counter++
        }
    }
    println(counter)
}