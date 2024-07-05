internal fun main() {
    val webProjectPrototype = WebProject(1, "Super Project", "<html><body>Hello World</body></html>")
    val webProjectClone = ProjectFactory(webProjectPrototype).makeProject()
    println(webProjectClone)
}

internal class ProjectFactory(
    private val project: Project
) {
    fun makeProject(): Project {
        return project.myCopyImpl() as WebProject
    }
}

/**
 * Prototype class.
 */
internal open class Project(
    private val id: Int,
    private val name: String,
    private val code: String
) : MyCopyable {

    override fun myCopyImpl(): Any {
        return Project(id, name, code)
    }
}

/**
 * Concrete Prototypes to clone.
 */
internal class WebProject(
    id: Int,
    name: String,
    code: String
) : Project(id, name, code)

internal class BankProject(
    id: Int,
    name: String,
    code: String
) : Project(id, name, code)

internal interface MyCopyable {
    fun myCopyImpl(): Any
}
