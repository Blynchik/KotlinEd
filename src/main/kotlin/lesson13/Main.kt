package lesson13

import kotlin.math.E

fun main() {
    val prog1 = Programmer("Brad", 40000)
    prog1.readArticle("article")
    prog1.addProject("project")
    prog1.addProject("project1")
    prog1.addProject("project2")
    prog1.printAllProjects()

    val emp1 = Employee("Julia", 33333)
    val manager1 = Employee("Peter", 333333)
    manager1.addProject("projectPersonal")

    val employees = listOf(prog1, emp1, manager1)

    for(e in employees){
        e.addProject("projectCommon")
    }

    for(e in employees){
        e.printAllProjects()
    }
}

open class Employee(
    val name: String,
    val salary: Int = 100000
) {
    private val projects: MutableList<String> = mutableListOf()

    fun addProject(projectName: String) {
        projects.add(projectName);
        println("$name starts project $projectName")
    }

    fun printAllProjects() {
        for (p in projects) {
            println(p)
        }
    }
}

class Programmer(name: String, salary: Int) : Employee(name, salary) {
    fun readArticle(article: String) {
        println("${this.name} read $article")
    }
}

class Manager(name: String, salary: Int) : Employee(name, salary)