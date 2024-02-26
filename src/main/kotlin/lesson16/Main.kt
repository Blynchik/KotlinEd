package lesson16

fun main() {
    val childrenCount: Int? = null// ? означает, что может быть null
    val number: Double? = null
    val user: User? = null

    val count = childrenCount ?: 0 // тернарный оператор

    val rectangle: Rectangle? = Rectangle(3,4)
    if(rectangle!=null) {
        rectangle.printArea()
    }

    rectangle?.printArea() // то же самое, что сверху
    rectangle!!.printArea()// принудительно без проверки
}

data class User(val name: String, val age: Int?)

fun some(count: Int?) {
    //logic
}

class Rectangle(val a: Int, val b: Int) {
    fun printArea() {
        val result = a * b
        println(result)
    }
}