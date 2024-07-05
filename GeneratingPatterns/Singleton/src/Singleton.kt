internal class Singleton private constructor() {

    private val log = StringBuffer()

    fun addLog(log: String) {
        this.log.append("$log\n")
    }

    fun getLog(): String {
        return log.toString()
    }

    companion object {
        private var instance: Singleton? = null
        fun getInstance(): Singleton {
            if (instance == null) {
                instance = Singleton()
            }
            return instance!!
        }
    }
}
