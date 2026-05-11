package oop_110834_StaveyJeremyLahindah.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance")