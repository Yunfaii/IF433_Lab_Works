package oop_110834_StaveyJeremyLahindah.week06

interface SmartDevice{
    abstract val id : String
    abstract val name : String
}

interface Switchable{
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable {
    abstract fun startRecord()
    abstract fun stopRecord()
}