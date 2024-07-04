package design_patterns.abstract_factory.banking

import design_patterns.abstract_factory.Developer
import design_patterns.abstract_factory.Manager
import design_patterns.abstract_factory.ProjectTeamFactory
import design_patterns.abstract_factory.Tester

internal class BankingTeamFactory : ProjectTeamFactory {
    override fun createDeveloper(): Developer {
        return PhpDeveloper()
    }

    override fun createTester(): Tester {
        return ManualTester()
    }

    override fun createManager(): Manager {
        return ProjectManager()
    }
}

internal class PhpDeveloper : Developer {
    override fun writeCode() {
        println("Php developer writes code")
    }
}

internal class ManualTester : Tester {
    override fun testCode() {
        println("Manual tester tests code")
    }
}

internal class ProjectManager : Manager {
    override fun manageProject() {
        println("PM manages project")
    }
}