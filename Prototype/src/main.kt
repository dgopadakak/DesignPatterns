internal fun main() {
    val master = Project(1, "Super Project", "<html><body>Hello World</body></html>")
    println(master)

    val masterClone1 = master.myCopyImpl()
    val masterClone2 = ProjectFactory(master).cloneProject()
    println(masterClone1)
    println(masterClone2)
}

internal class ProjectFactory(
    private val project: Project
) {
    fun cloneProject(): Project {
        return project.myCopyImpl() as Project
    }
}

internal data class Project(
    val id: Int,
    val name: String,
    val code: String
) : MyCopyable {

    override fun myCopyImpl(): Any {
        return Project(id, name, code)
    }
}


internal interface MyCopyable {
    fun myCopyImpl(): Any
}
