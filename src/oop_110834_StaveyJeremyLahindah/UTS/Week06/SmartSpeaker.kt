package oop_110834_StaveyJeremyLahindah.UTS.Week06

class SmartSpeaker(
    override val id : String,
    override val name : String
) : Switchable, SmartDevice {

    override fun turnOn() {
        println("SmartSpeaker is now ON!")
    }

    override fun turnOff() {
        println("SmartSpeaker is now OFF!")
    }

    fun playMusic(song : String){
        println("Playing the song $song from spotify")
    }
}