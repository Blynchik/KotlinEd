package lesson17

fun main() {
    val a = ";lklkjjh"
    val b = 0

    try {
        val result = a.toInt() / b
        println(result)
    } catch (e: ArithmeticException) {
        println(e.toString())
    } catch (e: NumberFormatException) {
        println(e.toString())
    } catch (e: Exception) {
        println(e.toString())
    }

    val login = "login"
    val password = "password"
    val confirmPassword = "password"

    try {
        signIn(login, password, confirmPassword)
    } catch (e:Exception){
        println(e.message)
    }
}

fun signIn(login: String, password: String, confirmPassword: String) {
    if(login.length > 20){
        throw Exception("Long login")
    }
    if(password.length<10){
        throw Exception("Short login")
    }
    if(password != confirmPassword){
        throw Exception("Incorrect password")
    }

//отправить данные на сервер
}