internal fun main() {
    val specialty = Specialty.JavaDeveloper
    val developerFactory = createDeveloper(specialty)
    val developer = developerFactory.createDeveloper()

    developer.sayHello()
}

internal fun createDeveloper(specialty: Specialty): DeveloperFactory {
    return when (specialty) {
        is Specialty.JavaDeveloper -> JavaDeveloperFactory()
        is Specialty.KotlinDeveloper -> KotlinDeveloperFactory()
    }
}

internal interface Developer {
    fun sayHello()
}

internal class JavaDeveloperFM : Developer {
    override fun sayHello() {
        println("Hello from Java developer!")
    }
}

internal class KotlinDeveloperFM : Developer {
    override fun sayHello() {
        println("Hello from Kotlin developer!")
    }
}

internal interface DeveloperFactory {
    fun createDeveloper(): Developer
}

internal class JavaDeveloperFactory : DeveloperFactory {
    override fun createDeveloper() = JavaDeveloperFM()
}

internal class KotlinDeveloperFactory : DeveloperFactory {
    override fun createDeveloper() = KotlinDeveloperFM()
}

internal sealed class Specialty {
    data object JavaDeveloper: Specialty()
    data object KotlinDeveloper: Specialty()
}
