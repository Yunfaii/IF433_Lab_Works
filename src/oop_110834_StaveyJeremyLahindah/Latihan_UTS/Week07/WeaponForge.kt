package oop_110834_StaveyJeremyLahindah.Latihan_UTS.Week07

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object {
        fun forgeStarterSword() : Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 10)
        }
        fun forgeEpicSword() : Weapon {
            return Weapon(GameItem("Durandal", 60, ItemRarity.EPIC), 100)
        }
    }
}