package oop_110834_StaveyJeremyLahindah.week06

class SmartLamp (
    override val Id : String,
    override val Name :String
): SmartDevice, Switchable{
    override fun turnOn() {
        println("SmartLamp has been turned on")
    }

    override fun turnOff() {
        println("SmartLamp has been turned off")
    }
}