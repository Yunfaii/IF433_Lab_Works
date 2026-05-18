package oop_110834_StaveyJeremyLahindah.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT===")
    val file = File("notes.txt")
    file.writeText("Line 1 : Inisialisasi sistem.\n")
    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append")
    println("File berhasil dibuat dan ditulis.")
}