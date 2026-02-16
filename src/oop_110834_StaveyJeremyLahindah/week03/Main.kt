package oop_110834_StaveyJeremyLahindah.week03

fun main () {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji : ${e.salary}")

    e.increasePerformance()
    //e.performanceRating = 5

    println("Pajak yang harus dibayar : ${e.tax}")
}
