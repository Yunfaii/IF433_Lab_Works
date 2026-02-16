package oop_110834_StaveyJeremyLahindah.week03.tugasmandiri1

fun main() {

    println("---Weapon Task---")
    val e = Weapon("Buster")
    e.damage = 900
    println(e.rarity)
    e.damage = 2000
    e.damage = -1
    println(e.damage)
    e.damage = 600
    println(e.rarity)

    println("---Player Task---")
    val p = Player("Slick")
    println("${p.username} is level ${p.level}")
    p.addXp(50)
    p.addXp(60)
    println("${p.username} is level ${p.level}")
}