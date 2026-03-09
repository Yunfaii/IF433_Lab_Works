package oop_110834_StaveyJeremyLahindah.week06

class SmartSpeaker : SmartDevice, Switchable{
    override val Id : String = "321321"
    override val Name = "SmartSpeaker"

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