package oop_110834_StaveyJeremyLahindah.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {"Api Invalid: Missing ID"}
        val name = requireNotNull(rawJson["name"] as? String) {"Api Invalid: Missing Name"}

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = (rawJson["warranty"] as? Int) ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
}