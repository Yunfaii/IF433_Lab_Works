package oop_110834_StaveyJeremyLahindah.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Change Salary to $value")
            this.salary = value
        }
}