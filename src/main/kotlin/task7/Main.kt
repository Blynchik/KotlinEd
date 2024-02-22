package task7

fun main() {

}

open class Figure(
    private val color: String
) {
    private var x = 0
    private var y = 0

    fun moveLeft(step: Int) {
        x -= step
    }

    fun moverRight(step: Int) {
        x += step
    }

    fun moveDown(step: Int) {
        y-= step
    }

    fun moveUp(step: Int) {
        y += step
    }
}