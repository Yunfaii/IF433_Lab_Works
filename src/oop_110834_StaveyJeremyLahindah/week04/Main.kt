package oop_110834_StaveyJeremyLahindah.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Electric Car ---")
    val ElCar = ElectricCar("Toyota", 4, 90)
    ElCar.accelerate()
    ElCar.openTrunk()

    println("\n--- Employee ---")
    val Manager = Manager("Rick", 5000000)
    Manager.work()
    println("Bonus: Rp ${Manager.calculateBonus()}")


    println("\n")
    val Dev = Developer("Morty", 7000000, "C++")
    Dev.work()
    println("Bonus: Rp ${Dev.calculateBonus()}")
}