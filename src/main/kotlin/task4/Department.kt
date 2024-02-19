package task4

import kotlin.math.E

data class Department(val name: String, val employees: List<Employee>)

data class Employee(val name: String, val age: Int)

data class Company(val name: String, val departments: List<Department>)

fun getAvgAge(department: Department): Int {
    var sum = 0
    for (employee in department.employees) {
        sum += employee.age
    }
    return sum / department.employees.size
}

fun totalNumberOfEmployees(company: Company): Int {
    var sum = 0
    for (department in company.departments) {
        sum += department.employees.size
    }
    return sum;
}

fun averageAgeOfEmployees(company: Company): Int {
    var sum = 0
    for (department in company.departments) {
        sum += getAvgAge(department)
    }
    return sum / company.departments.size
}

fun main() {
    println(
        getAvgAge(
            Department(
                "Отдел", listOf(
                    Employee("Вася", 15),
                    Employee("Петя", 18),
                    Employee("Саня", 190)
                )
            )
        )
    )

    println(
        totalNumberOfEmployees(
            Company(
                "Coop", listOf(
                    Department(
                        "D1", listOf(
                            Employee("Вася", 25),
                            Employee("Петя", 38),
                            Employee("Саня", 45)
                        )
                    ),
                    Department(
                        "D2", listOf(
                            Employee("Вася", 35),
                            Employee("Петя", 28),
                            Employee("Саня", 55)
                        )
                    ),
                    Department(
                        "D3", listOf(
                            Employee("Вася", 25),
                            Employee("Петя", 48),
                            Employee("Саня", 25)
                        )
                    )
                )
            )
        )
    )

    println(
        averageAgeOfEmployees(
            Company(
                "Coop", listOf(
                    Department(
                        "D1", listOf(
                            Employee("Вася", 25),
                            Employee("Петя", 38),
                            Employee("Саня", 45)
                        )
                    ),
                    Department(
                        "D2", listOf(
                            Employee("Вася", 35),
                            Employee("Петя", 28),
                            Employee("Саня", 55)
                        )
                    ),
                    Department(
                        "D3", listOf(
                            Employee("Вася", 25),
                            Employee("Петя", 48),
                            Employee("Саня", 25)
                        )
                    )
                )
            )
        )
    )
}
