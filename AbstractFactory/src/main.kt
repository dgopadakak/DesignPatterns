package design_patterns.abstract_factory

import design_patterns.abstract_factory.banking.BankingTeamFactory
import design_patterns.abstract_factory.website.WebsiteTeamFactory

internal fun main() {
    val auctionSiteProject = AuctionSiteProject()
    val superBankProject = SuperBankProject()

    auctionSiteProject.createProject()
    println()
    superBankProject.createProject()
}

internal class AuctionSiteProject {
    fun createProject() {
        val projectTeamFactory: ProjectTeamFactory = WebsiteTeamFactory()
        val developer: Developer = projectTeamFactory.createDeveloper()
        val tester: Tester = projectTeamFactory.createTester()
        val manager: Manager = projectTeamFactory.createManager()

        developer.writeCode()
        tester.testCode()
        manager.manageProject()
    }
}

internal class SuperBankProject {
    fun createProject() {
        val projectTeamFactory: ProjectTeamFactory = BankingTeamFactory()
        val developer: Developer = projectTeamFactory.createDeveloper()
        val tester: Tester = projectTeamFactory.createTester()
        val manager: Manager = projectTeamFactory.createManager()

        developer.writeCode()
        tester.testCode()
        manager.manageProject()
    }
}
