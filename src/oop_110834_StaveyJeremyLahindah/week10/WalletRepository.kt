package oop_110834_StaveyJeremyLahindah.week10

class WalletRepository<T : Name> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items

    fun findByName(query: String): List<T>{
        return items.filter {it.name.contains(query, ignoreCase = true)}
    }
}