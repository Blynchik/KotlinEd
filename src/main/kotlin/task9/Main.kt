package task9

fun main() {
    val things = listOf(Triangle(324.0, 325.0, 325.0, "blue"), Animal("Barsik", 0, 0))
    for (thing in things) {
        thing.moveRight(10)
    }
}

interface Movable {
    fun moveLeft(step: Int)

    fun moveRight(step: Int)

    fun moveDown(step: Int)

    fun moveUp(step: Int)
}

class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double,
    color: String
) : Figure(color), Movable {

    override fun getSquare(): Double {
        return 0.5 * a * getPerimeter() / 2
    }

    override fun getPerimeter(): Double {
        return a + b + c
    }
}

abstract class Figure(
    private val color: String
) : Movable {
    private var x = 0
    private var y = 0

    abstract fun getSquare(): Double

    abstract fun getPerimeter(): Double

    override fun moveLeft(step: Int) {
        x -= step
    }

    override fun moveRight(step: Int) {
        x += step
    }

    override fun moveDown(step: Int) {
        y -= step
    }

    override fun moveUp(step: Int) {
        y += step
    }
}

class Animal(
    private val name: String,
    private var x: Int,
    private var y: Int
) : Movable {

    override fun moveLeft(step: Int) {
        x -= step
    }

    override fun moveRight(step: Int) {
        x += step
    }

    override fun moveDown(step: Int) {
        y -= step
    }

    override fun moveUp(step: Int) {
        y += step
    }
}