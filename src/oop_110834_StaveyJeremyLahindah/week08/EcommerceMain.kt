package oop_110834_StaveyJeremyLahindah.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
                mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )
    val parse = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parse.parseProduct(raw)

            product?.let {
                when (it) {
                    is Electronic -> println("Processing : ${it.name} (Warranty : ${it.warrantyMonths} Months)\n")
                    is Clothing -> println("Processing: ${it.name} (Size ${it.size})\n")
                }
                parse.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("[Error] Data Corrupted : ${e.message}")
        }
    }

    // Sudah Dijalankan
}