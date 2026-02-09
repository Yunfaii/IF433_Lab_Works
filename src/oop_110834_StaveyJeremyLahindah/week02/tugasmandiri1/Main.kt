package oop_110834_StaveyJeremyLahindah.week02.tugasmandiri1

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)
    println("--- Peminjaman Buku Library ---")

    print("Masukkan Nama Buku: ")
    val book_name = scanner.nextLine()
    print("Masukkan Nama Peminjam: ")
    val book_borrower = scanner.nextLine()
    print("Masukkan Durasi Peminjaman: ")
    val book_duration = scanner.nextInt()
    scanner.nextLine()
    val B1 = Loan(book_name, book_borrower, book_duration)

    println("--- Informasi Peminjaman ---")
    println("Buku : ${B1.bookTitle}, dipinjam oleh ${B1.borrower}")
    println("Total Denda : ${B1.calculateFine(book_duration)}")
}