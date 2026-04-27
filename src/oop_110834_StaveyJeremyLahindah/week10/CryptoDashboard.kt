package oop_110834_StaveyJeremyLahindah.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 12.4))
    coinRepo.add(Coin("USDT", 120.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())


}