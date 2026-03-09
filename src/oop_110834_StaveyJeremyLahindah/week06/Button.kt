package oop_110834_StaveyJeremyLahindah.week06

class Button (override val name: String) : Clickable{
    override fun click() {
        println("Tombbol '$name' berhasil diklik!")
    }
}