internal fun main() {
    val singleton = Singleton.getInstance()
    singleton.addLog("Log 1")
    singleton.addLog("Log 2")
    singleton.addLog("Log 3")
    singleton.addLog("Log 4")
    println(singleton.getLog())
}
