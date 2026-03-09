package oop_110834_StaveyJeremyLahindah.week06

class SmartWatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala : 14:59 WIB")
    }

    override fun connectToBluetooth() {
        println("mencari perangkat HP di sekitar untuk pairing....")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}