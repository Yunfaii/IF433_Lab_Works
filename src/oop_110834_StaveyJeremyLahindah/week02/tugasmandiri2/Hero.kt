package oop_110834_StaveyJeremyLahindah.week02.tugasmandiri2

class Hero (
    val name : String,
    var hp : Int = 100,
    val baseDamage : Int
) {
    fun attack(targetName : String) {
        println("$name Attacks $targetName!")
    }
    fun takeDamage(damage : Int){
        println("$name Takes $damage damage!")
        hp -= damage
        if (!isAlive()) {
            println("$name Has fainted")
        } else {
            println("$name has $hp hp left!")
        }
    }
    fun isAlive() : Boolean = hp > 0
}