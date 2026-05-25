package oop_110834_StaveyJeremyLahindah.Belajar.Week8

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Sending email to: $emailAddress")
    }

    fun processUser(user: UserProfile){

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}