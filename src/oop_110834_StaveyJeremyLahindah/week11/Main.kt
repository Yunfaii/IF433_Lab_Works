package oop_110834_StaveyJeremyLahindah.week11

fun main() {
    println("=== TEST EXTENSION FUNCTONS ===")
    println("Alex".addGreeting())
    println("Hi".repeat(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}