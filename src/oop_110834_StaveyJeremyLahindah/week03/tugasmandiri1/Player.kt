package oop_110834_StaveyJeremyLahindah.week03.tugasmandiri1

class Player (val username : String){
    private var xp: Int = 0

    val level : Int
        get() = (xp/100) + 1

    fun addXp (amount : Int){
        if (amount > 0) {

            val oldlv = level

            println("Adding $amount Xp to player")
            xp += amount
            println("Xp has been added")

            val currlv = level

            if (currlv > oldlv) {
                println("Congrats! you leveled Up! $username is level $level")
            }
        }
    }
}