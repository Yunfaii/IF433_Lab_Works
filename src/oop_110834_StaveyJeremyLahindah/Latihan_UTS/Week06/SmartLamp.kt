package oop_110834_StaveyJeremyLahindah.Latihan_UTS.Week06

class SmartLamp (
    override val id : String,
    override val name : String)
    : SmartDevice, Switchable{
    override fun turnOff() {
        println("Smart Lamp is now OFF!")
    }

    override fun turnOn() {
        println ("SmartLamp is now ON!")
    }
}