package oop_110834_StaveyJeremyLahindah.week09

fun main(){
    println("=== Test Lambda ===")
    val sumLambda = {a : Int, b: Int -> a + b}
    println("Hasil sum: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("Hasil Square: ${squareImplicit(4)}")
}