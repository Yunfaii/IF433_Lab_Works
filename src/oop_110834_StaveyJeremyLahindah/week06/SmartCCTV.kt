package oop_110834_StaveyJeremyLahindah.week06

class SmartCCTV: SmartDevice, Switchable, Recordable{
    override val Id = "123"
    override val Name = "SmartCCTV"

    override fun turnOff()  {
        stopRecord()
        println ("$Name is turning Off")

    }
    override fun turnOn() {
        startRecord()
        println ("$Name is turning On")
    }

    override fun startRecord() {
        println ("$Name is Starting to Record")
    }
    override fun stopRecord() {
        println ("$Name is Ending the Recording")
    }
}