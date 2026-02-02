package oop_110834_StaveyJeremyLahindah.week01

fun main(args : Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println ("Radius: $radius, Area: $area")

    println ("This is a ${checkSize(area)} circle")
}

fun checkSize(area: Double) = if (area > 100) "Big" else "Small"
