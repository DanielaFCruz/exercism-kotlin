import kotlin.math.pow

fun main() {
    quadrado()
}

fun quadrado() {
    println("Digite o lado do quadrado: ")
    val lado = readln().toDouble()
    val area = lado.pow(2.0)

    println("A area do quadrado é: $area")
}