package task8

abstract class Figure(
    private val color: String
) {
    private var x = 0
    private var y = 0

    abstract fun getSquare(): Double

    abstract fun getPerimeter(): Double

    fun moveLeft(step: Int) {
        x -= step
    }

    fun moverRight(step: Int) {
        x += step
    }

    fun moveDown(step: Int) {
        y -= step
    }

    fun moveUp(step: Int) {
        y += step
    }
}

class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double,
    color: String
) : Figure(color) {

    override fun getSquare(): Double {
        return 0.5 * a * getPerimeter() / 2
    }

    override fun getPerimeter(): Double {
        return a + b + c
    }
}