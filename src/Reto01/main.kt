package Reto01

import java.text.NumberFormat
import java.util.*

fun main() {
    val moneyFormat = NumberFormat.getCurrencyInstance(Locale("es", "MX"))
    val smartWatch = SmartWatch(5699f, "Xiaomi MiBand 5", "5")

    println("\nEl total a pagar por dos ${smartWatch.name} es: ${moneyFormat.format(smartWatch.getTotalPrice(2))}")
}
