package task11

fun main(){
    val e1 = SomeEmployee("john", 100)
    val e2 = SomeEmployee("nick", 200)
    val e3 = SomeEmployee("peter", 300)

    val list = listOf(e1, e2, e3)

    try {
        findEmployeeBySalary(list, 150).callToClient("kevin")
    } catch (e:Exception){
        println(e.message)
    }
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {
    for (e in employees) {
        if (e.salary == salary) {
            return e
        }
    }
    throw Exception("Not found")
}