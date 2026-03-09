package oop_110834_StaveyJeremyLahindah.week06

fun processCheckout(method : PaymentMethod, amount : Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main () {
    val myWatch = SmartWatch()
    myWatch.showTime()
    val myPhone = Smartphone()
    myPhone.turnOn()
    val pay1 = Gopay ()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // Tugas
    val lamp = SmartLamp("123", "Ruang Tamu")
    val speaker = SmartSpeaker ("231", "Google Nest Dapur")
    val cctv = SmartCCTV ("321", "Ezviz Garasi")

    println("\n=== Instansiasi SmartHomeHub ===")
    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}