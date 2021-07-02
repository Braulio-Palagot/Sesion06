package Ejemplo03

class RandomGenerator {
    companion object RandomNumbers {
        fun generate(): Int {
            return (0..10).random()
        }

        val initialText = "Números Aleatorios"
    }
}