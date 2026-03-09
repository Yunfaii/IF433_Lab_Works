package oop_110834_StaveyJeremyLahindah.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operaisi smartphone berhasil booting")
    }
}