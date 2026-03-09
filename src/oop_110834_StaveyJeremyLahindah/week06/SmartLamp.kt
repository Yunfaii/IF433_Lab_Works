package oop_110834_StaveyJeremyLahindah.week06

class SmartLamp: SmartDevice, Switchable{
    override val Id = "123123"
    override val Name = "SmartLamp"
    override fun turnOn() {
        println("SmartLamp has been turned on")
    }

    override fun turnOff() {
        println("SmartLamp has been turned off")
    }
}