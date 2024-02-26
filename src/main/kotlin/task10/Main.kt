package task10

class SomeEmployee(
    val name: String,
    val salary: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun main() {
    val e1 = SomeEmployee("john", 100)
    val e2 = SomeEmployee("nick", 200)
    val e3 = SomeEmployee("peter", 300)

    val list = listOf(e1, e2, e3)

    findEmployeeBySalary(list, 200)?.callToClient("kevin")
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    for (e in employees) {
        if (e.salary == salary) {
            return e
        }
    }
    return null
}