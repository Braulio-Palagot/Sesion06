import Reto01.User
import java.text.SimpleDateFormat
import java.util.*


fun main() {
    val now = Date()
    val formatDate = SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss")

    println("Fecha actual: ${formatDate.format(now)}")

    val user = User("Braulio",
                    "Hernández Palagot",
                    "Soltero",
                    20,
                    true)

    user.name = "David"
    user.status = "Concubinato"
    println(user.status)
}