package oop_110834_StaveyJeremyLahindah.week03

class Weapon (val name : String){
    var damage : Int = 0
        set (value) {
            if (value > 1000) {
                println("Damage tidak boleh lebih dari 1000 beb, setting to 1000")
                field = 1000
            } else if (value > 0){
                println("Damage set to $value")
                field = value
            } else {
                println("Damage Tidak boleh negatif sayang")
            }
        }

    val rarity : String
        get() = when (damage){
            in 801..1000 -> "Legendary"
            in 501..800 -> "Epic"
            else -> "Common"
        }
}
