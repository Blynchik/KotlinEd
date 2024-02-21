package lesson12

fun main(){
     val employee1 = Employee("John", 234343)
    val employee2 = Employee("Sara")
    employee1.callToClient("Peter")
    employee2.addProject("Project1")
    employee2.addProject("Project2")
    employee2.printAllProjects()
}

class Employee(
    val name: String,
    val salary: Int = 100000
){
    private val projects: MutableList<String> = mutableListOf()

    fun callToClient(clientName: String){
        println("$name call to $clientName")
    }

    fun addProject(projectName: String){
        projects.add(projectName);
        println("$name starts project $projectName")
    }

    fun printAllProjects(){
        for(p in projects){
            println(p)
        }
    }
}