package oop_110834_StaveyJeremyLahindah.week07

fun processEvent(event : BattleState){
    val message = when(event){
        is MonsterEncounter -> "You Encountered a ${event.monsterName}!"
        is GameOver -> "Game Over! You ${event.reason}"
        is LootDropped -> "You Gained ${event.item.name} Congrats!"
        is SafeZone -> "You are now Safe!"
    }
    println(message)
}