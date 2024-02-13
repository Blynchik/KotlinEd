package lesson3

fun main(){
    var a: Int = 5
    println(a)
    a++
    println(a)
    a = a + 5
    println(a)
    a += 10
    println(a)
    println(a>=20)

    var text: String = "Hello"
    println(text)
    println(text + ", World!")
    val length: Int = text.length
    println(length)
    val letter: Char = text[2]
    val anotherLetter: Char = 'P'
    println(letter)

    val name: String = "Вася"
    val age : Int = 27
    val doc: String = "passport"
    println("Пассажир $name, возраст: $age, вид документа: $doc")
}