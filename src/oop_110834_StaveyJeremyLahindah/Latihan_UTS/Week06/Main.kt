package oop_110834_StaveyJeremyLahindah.Latihan_UTS.Week06

fun main () {
    println("===Smart Stuff===")
    // Instatiate the Items
    val lamp = SmartLamp("01","Ruang Tamu")
    val speaker = SmartSpeaker("02","Google Nest Dapur")
    val CCTV = SmartCCTV("03","Ezviz Garasi")

    // Instatiate the Hub
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(CCTV)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()


}