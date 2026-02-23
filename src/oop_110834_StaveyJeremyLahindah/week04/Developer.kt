package oop_110834_StaveyJeremyLahindah.week04

open class Developer (name : String, baseSalary : Int, val programmingLanguage : String) : Employee(name, baseSalary) {
    override fun work () {
        println("$name sedang mengoding menggunakkan $programmingLanguage")
    }
}