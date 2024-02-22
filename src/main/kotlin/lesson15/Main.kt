package lesson15


fun main() {
    val rob1 = Robot(1)
    rob1.callToClient("john")
    val manager1 = Manager("Sara", 10000)
    manager1.callToClient("michel")

    val clientWorkers = listOf(rob1, manager1)
    for(w in clientWorkers){
        w.callToClient("Bart")
    }
}

interface ClientWorker {
    fun callToClient(clientName: String)
}

class Robot(val id: Int) : ClientWorker {
    override fun callToClient(clientName: String) {
        println("Robot $id calls to client $clientName")
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

class Manager(name: String, salary: Int) : Employee(name, salary), ClientWorker {
    override fun addProject(projectName: String) {
        projects.add(projectName);
        println("Manager $name starts project $projectName")
    }

    override fun callToClient(clientName: String) {
        println("Manager $name calls to client $clientName")
    }
}