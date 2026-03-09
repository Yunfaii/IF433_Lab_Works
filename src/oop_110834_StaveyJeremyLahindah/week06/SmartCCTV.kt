package oop_110834_StaveyJeremyLahindah.week06

class SmartCCTV(
    override val Id : String,
    override val Name :String
): SmartDevice, Switchable, Recordable{

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