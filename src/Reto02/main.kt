package Reto02

fun main() {
    val smartPhone = SmartPhone("Motorola", "G8", "Falcon", 5000f)
    println("El precio del ${smartPhone.name}  ${smartPhone.model} es: $${smartPhone.price}.")

    Stock.addArticles(7)
    println(Stock.getStock())
    Stock.removeArticles(2)
    println(Stock.getStock())
    Stock.addArticles(5)
    println(Stock.getStock())
}
