package oop_110834_StaveyJeremyLahindah.week02.tugasmandiri1

class Loan (
    val bookTitle : String,
    val borrower : String,
    var loanDuration : Int = 1) {

    fun calculateFine(duration : Int) = if (duration > 3) ((duration-3) * 2000) else 0
}