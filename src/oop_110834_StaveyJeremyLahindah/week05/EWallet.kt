package oop_110834_StaveyJeremyLahindah.week05

class EWallet (accountName : String, var balance : Double) : PaymentMethod(accountName) {

    override fun processPayment(amount : Double) {
        if (balance > amount){
            balance -= amount
            println("Balance has been deducted by ${amount}Rp current balance is ${balance}Rp")
        } else {
            println("Balance is not enough!")
        }
    }

    fun topUp (amount : Double){
        balance += amount
        println("Balance has been added by ${amount} current balance is now ${balance}Rp")
    }
}