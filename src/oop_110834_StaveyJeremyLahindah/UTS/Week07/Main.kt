package oop_110834_StaveyJeremyLahindah.UTS.Week07

fun main() {
    println("====Simple Game====")
    GameManager.startGame()
    GameManager.startGame()

    println("\nDrop Chance Rarity LEGENDARY adalah ${ItemRarity.LEGENDARY.dropChance}")
    val starterSword = Weapon.forgeStarterSword()
    println("You Forged ${starterSword.item.name}! Durability : ${starterSword.durability}, Rarity : ${starterSword.item.rarity}")

    println ("\nPlayer Goes to a blacksmith!")
    val upgradedStarterSword = starterSword.item.copy(damage = 15)
    println("Player has upgraded ${starterSword.item.name} damage from ${starterSword.item.damage} to ${upgradedStarterSword.damage}!\n")

    println("===Events===")
    println(processEvent(SafeZone))
    println(processEvent(MonsterEncounter("Venomous Snake")))
    println(processEvent(LootDropped(GameItem("Dusk", 100, ItemRarity.LEGENDARY))))
    println(processEvent(GameOver("Old Age")))
}