package oop_110834_StaveyJeremyLahindah.week07

object DatabaseManager {
    var connectionStatus : String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}