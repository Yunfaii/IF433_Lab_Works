package oop_110834_StaveyJeremyLahindah.UTS.Week06

class SmartCCTV(
    override val id : String,
    override val name : String
) : SmartDevice, Switchable, Recordable{
    override fun startRecord() {
        println ("SmartCCTV is now recording")
    }

    override fun turnOn() {
        println ("SmartCCTV is now ON!")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println ("SmartCCTV is now OFF!")
    }

    override fun stopRecord() {
        println ("SmartCCTV is now OFF!")
    }
}