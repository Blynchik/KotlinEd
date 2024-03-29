package task6

import task7.Figure

fun main() {
    val rectangle = Rectangle(5.0, 4.58, "red")
    println(
        "Площадь: ${rectangle.getSquare()}\n" +
                "Периметр: ${rectangle.getPerimeter()}\n" +
                "Квадрат: ${rectangle.isSquare()}"
    )

    val round = Round(8.341, "blue")
    println(
        "Площадь: ${round.getSquare()}\n" +
                "Длина: ${round.getLength()}"
    )
}

class Rectangle(
    private val width: Double,
    private val height: Double,
    color: String
) : Figure(color) {
    fun getSquare(): Double {
        return this.width * this.height
    }

    fun getPerimeter(): Double {
        return 2 * (this.width + this.height)
    }

    fun isSquare(): Boolean {
        return this.width == this.height
    }
}

class Round(
    private val radius: Double,
    color: String
) : Figure(color) {
    fun getSquare(): Double {
        return Math.PI * this.radius * this.radius
    }

    fun getLength(): Double {
        return 2 * Math.PI * this.radius
    }
}