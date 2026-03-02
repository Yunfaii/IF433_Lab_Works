package oop_110834_StaveyJeremyLahindah.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------------")
    }

    println("=== Math Things===")
    val helper = MathHelper()
    val persegi = helper.hitungLuas(3)
    println("Nilai luas persegi dengan sisi 3cm adalah ${persegi}cm")
    val persegi_panjang = helper.hitungLuas(3, 5)
    println("Nilai luas persegi panjang dengan panjang 3cm dan lebar 5cm adalah ${persegi_panjang}cm")
    val lingkaran = helper.hitungLuas(7.0)
    println("Nilai luas lingkaran dengan jari-jari 7.0 adalah ${lingkaran}")






}