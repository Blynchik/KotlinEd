package lesson14

fun main() {
    val prog1 = Programmer("john", 1000)
    prog1.addProject("project1")
    val mananger1 = Manager("kel", 5000)
    mananger1.addProject("proj2")

    val employees = listOf(prog1, mananger1)
    for(e in employees){
        e.addProject("commonProj")
    }
}

abstract class Employee(
    val name: String,
    val salary: Int = 100000
) {
    protected val projects: MutableList<String> = mutableListOf()

    abstract fun addProject(projectName: String)

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

    override fun addProject(projectName: String) {
        projects.add(projectName);
        println("Programmer $name starts project $projectName")
    }
}

class Manager(name: String, salary: Int) : Employee(name, salary) {
    override fun addProject(projectName: String) {
        projects.add(projectName);
        println("Manager $name starts project $projectName")
    }
}