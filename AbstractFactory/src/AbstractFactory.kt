package design_patterns.abstract_factory

internal interface ProjectTeamFactory {
    fun createDeveloper(): Developer
    fun createTester(): Tester
    fun createManager(): Manager
}

internal interface Developer {
    fun writeCode()
}

internal interface Tester {
    fun testCode()
}

internal interface Manager {
    fun manageProject()
}