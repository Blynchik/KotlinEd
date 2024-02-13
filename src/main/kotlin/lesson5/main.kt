package lesson5

fun main() {
    val passengerAge: Int = 15

    if(passengerAge > 14)
        println("Нужен паспорт")
    else
        println(" Нужно Свидетельсво о рождении")

    val doc: String = if(passengerAge > 14)
        "паспорт"
    else
        "Свидетельсво о рождении"

    println(doc)
}