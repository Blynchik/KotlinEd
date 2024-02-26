package task10

class Address(val address: String, val city: String)

class Company(val name: String, val address: Address?)

class Employee(val name: String, val company: Company?)

fun employeeCity(employee: Employee): String {
    return employee.company?.address?.city ?: "Неизвестен"
}

fun main(){
    val e1 = Employee("george", Company("coop", Address("street", "moscow")))
    val e2 = Employee("george", Company("coop", null))
    val e3 = Employee("george", null)

    val list = listOf(e1, e2, e3)
    for(e in list){
        println( employeeCity(e))
    }
}