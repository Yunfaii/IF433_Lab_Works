package oop_110834_StaveyJeremyLahindah.Belajar.Week8

fun main() {
    println("=== TEST BRE LAWJEFLKASJF ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota gtau gw"
    println("DIkirimm ke sini : $destination")

    println("\n=== test let bloc ===")
    val validOrder = order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid Harga: Rp$price, "
    }
}