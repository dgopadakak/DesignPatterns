package design_patterns.abstract_factory.website

import design_patterns.abstract_factory.Developer
import design_patterns.abstract_factory.Manager
import design_patterns.abstract_factory.ProjectTeamFactory
import design_patterns.abstract_factory.Tester

internal class WebsiteTeamFactory : ProjectTeamFactory {
    override fun createDeveloper(): Developer {
        return HtmlDeveloper()
    }

    override fun createTester(): Tester {
        return AutoTester()
    }

    override fun createManager(): Manager {
        return WebProjectManager()
    }
}

internal class HtmlDeveloper : Developer {
    override fun writeCode() {
        println("Html developer writes code")
    }
}

internal class AutoTester : Tester {
    override fun testCode() {
        println("Auto tester tests code")
    }
}

internal class WebProjectManager : Manager {
    override fun manageProject() {
        println("Web PM manages project")
    }
}