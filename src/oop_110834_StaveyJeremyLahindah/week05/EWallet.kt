package oop_110834_StaveyJeremyLahindah.week05

class EWallet (accountName : String, var balance : Double) : PaymentMethod(accountName) {

    override fun processPayment(amount : Double) {
        if (balance > amount){
            balance -= amount
            println("Balance has been deducted by Rp${amount} current balance is Rp${balance}")
        } else {
            println("Balance is not enough!")
        }
    }

    fun topUp (amount : Double){
        balance += amount
        println("Balance has been added by Rp${amount} current balance is now Rp${balance}")
    }
}