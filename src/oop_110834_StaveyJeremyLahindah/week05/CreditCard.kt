package oop_110834_StaveyJeremyLahindah.week05

class CreditCard (accountName : String, val limit: Double, var usedAmount : Double = 0.0): PaymentMethod(accountName) {
    override fun processPayment(amount : Double) {
        if (usedAmount + amount <= limit){
            usedAmount += amount
            println("Rp${usedAmount} Has been used!")
        } else {
            println("Over the limit Denied!")
        }
    }
}