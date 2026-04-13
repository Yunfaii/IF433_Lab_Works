package oop_110834_StaveyJeremyLahindah.UTS.Week06

interface SmartDevice {
    abstract val id : String
    abstract val name : String
}

interface Switchable {
    abstract fun turnOn()

    abstract fun turnOff()
}

interface Recordable {
    fun startRecord()

    fun stopRecord()
}