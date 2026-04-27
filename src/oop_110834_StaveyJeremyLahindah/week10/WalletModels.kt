package oop_110834_StaveyJeremyLahindah.week10

data class Coin(override val name: String, val balance: Double): Name

data class Transaction(val id: String, val amount: Double): Name {
    override val name: String = id
}