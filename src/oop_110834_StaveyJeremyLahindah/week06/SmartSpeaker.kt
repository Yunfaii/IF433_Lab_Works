package oop_110834_StaveyJeremyLahindah.week06

class SmartSpeaker(
    override val Id : String,
    override val Name :String
) : SmartDevice, Switchable{

    override fun turnOff()  {
        println ("$Name is turning Off")
    }
    override fun turnOn() {
        println ("$Name is turning On")
    }

    fun playMusic (song : String) {
        println("memutar lagu $song dari spotify")
    }
}