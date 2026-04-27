package oop_110834_StaveyJeremyLahindah.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 12.4))
    coinRepo.add(Coin("USDT", 120.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    println("--- Detail Koin dalam Respons ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name}, Saldo: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TRN-001", 500.0))
    txRepo.add(Transaction("TRN-002", 1250.5))
    txRepo.add(Transaction("TRN-003", 75.0))

    println("\n=== Log Transaksi Terkini ===")
    txRepo.getAll().forEach { tx ->
        println("ID Transaksi: ${tx.id} | Jumlah: ${tx.amount}")
    }
}