package oop_110834_StaveyJeremyLahindah.week02.tugasmandiri2

import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)

    println("--- Simple Game! ---")
    print("Hero Name: ")
    val name = scanner.nextLine()
    print("Base Damage: ")
    val damage = scanner.nextInt()
    scanner.nextLine()
    val h1 = Hero(name = name, baseDamage = damage)
    var enemyHp = 100
    val enemy = "Enemy"

    while(h1.isAlive()){
        println("${h1.name} Hp : ${h1.hp} | $enemy Hp : $enemyHp")
        println("Action: 1. Attack 2. Escape")
        print("Act : ")
        val act = scanner.nextInt()
        scanner.nextLine()

        when (act) {
            1 -> {
                h1.attack(enemy)
                Thread.sleep(2000)
                enemyHp -= h1.baseDamage
                if (enemyHp <= 0) {
                    enemyHp = 0
                    println("$enemy hp is $enemyHp")
                    Thread.sleep(2000)
                    println("$enemy has Fainted!")
                    Thread.sleep(2000)
                    println("You Win!")
                    break
                }
                println("$enemy takes ${h1.baseDamage} damage!")
                Thread.sleep(2000)
                println("$enemy Attacks!")
                Thread.sleep(2000)
                h1.takeDamage((10 .. 20).random())
                Thread.sleep(2000)
                if (h1.hp == 0){
                    println("${h1.name} hp is ${h1.hp}")
                    println("${h1.name} has fallen")
                    Thread.sleep(2000)
                    println("You Lose!")
                    Thread.sleep(2000)
                    break
                }
            }
            2 -> {
                Thread.sleep(2000)
                println("${h1.name} flees!")
                Thread.sleep(2000)
                if (h1.hp > enemyHp){
                    println("You had the Higher Hp")
                    Thread.sleep(2000)
                    println("You Win!")
                    Thread.sleep(2000)
                } else {
                    println("You had the Lower Hp")
                    Thread.sleep(2000)
                    println("You Lose!")
                    Thread.sleep(2000)
                }
                break
            }
        }
    }
    println("Game Over!")
}