package oop_110834_StaveyJeremyLahindah.week01

fun main () {
    val gameTitle = "Ultrakill"
    val price = 60000

    printReceipt(title = gameTitle, finalPrice = calculateDiscount(price))
}

fun calculateDiscount(price : Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title : String, finalPrice: Int) {
    val userNote : String? = null
    val note = userNote ?: "Tidak ada Catatan"

    println("Harga akhir Game : $title, adalah Rp$finalPrice")
    println("Notes : $note")
}