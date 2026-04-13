package oop_110834_StaveyJeremyLahindah.UTS.Week07

fun processEvent(event: BattleState): String{
    return when(event){
        is GameOver -> "You Failed! Reason : ${event.reason}"
        is LootDropped -> "You Obtained ${event.item.name}, with the rarity ${event.item.rarity}"
        is MonsterEncounter -> "You are encountered a ${event.monsterName}!"
        is SafeZone -> "You are Safe!"
    }
}