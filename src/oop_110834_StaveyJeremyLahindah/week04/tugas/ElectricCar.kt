package oop_110834_StaveyJeremyLahindah.week04.tugas

import oop_110834_StaveyJeremyLahindah.week04.Car

open class Car (brand : String, numberOfDoors : Int, val batteryCapacity : Int) : Car (brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai $batteryCapacity")
    }
}
    


