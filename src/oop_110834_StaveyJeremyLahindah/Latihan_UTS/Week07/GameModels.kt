package oop_110834_StaveyJeremyLahindah.Latihan_UTS.Week07

enum class ItemRarity (val dropChance : Int) {
    COMMON(60),
    UNCOMMON(20),
    RARE(15),
    EPIC(4),
    LEGENDARY(1)
}

data class GameItem (val name : String, val damage : Int, val rarity : ItemRarity)