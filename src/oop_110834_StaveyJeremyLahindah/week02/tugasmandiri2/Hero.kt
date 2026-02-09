package oop_110834_StaveyJeremyLahindah.week02.tugasmandiri2

class Hero (
    val name : String,
    var hp : Int = 100,
    val baseDamage : Int
) {
    fun attack(targetName : String) {
        println("$name attacks $targetName!")
    }
    fun takeDamage(damage : Int){
        println("$name takes $damage damage!")
        hp -= damage
        if (hp <= 0) {
            hp = 0
        }
    }
    fun isAlive() : Boolean = hp > 0
}