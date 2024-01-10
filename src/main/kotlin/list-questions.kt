import kotlin.math.pow
import kotlin.math.sqrt


class Pessoa(val primeiroNome: String) {
    fun correr() {
        println("Estou correndo $primeiroNome")
    }
}

fun main() {
    quadrado()

}

fun equacao() {
    println("Digite o coeficiente a: ")
    var coeficienteA = readln().toDouble()
    println("Digite o coeficiente b: ")
    var coeficienteB = readln().toDouble()
    println("Digite o coeficiente c: ")
    var coeficienteC = readln().toDouble()

    val delta = coeficienteB.pow(2.0) - (4 * coeficienteA * coeficienteC)

    val x1 = (- coeficienteB + sqrt(delta)) / 2 * coeficienteA
    val x2 = (- coeficienteB - sqrt(delta)) / 2 * coeficienteA

    println("As raízes reais são $x1 e $x2")

}

fun trocaV() {
    println("Digite o valor de x: ")
    var x = readln().toDouble()
    println("Digite o valor de y: ")
    var y = readln().toDouble()

    var aux = y
    y = x
    x = aux

    println("O valor de x é $x e o valor de y é $y")

}

// Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.

fun paralelepipido() {
    println("Digite o comprimento: ")
    var comprimento = readln().toDouble()
    println("Digite a largura: ")
    var largura = readln().toDouble()
    println("Digite o altura: ")
    var altura = readln().toDouble()

    val volume = altura * comprimento * largura

    println("O volume do paralelepípedo é de $volume"+ "cm³")

}


// Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

fun poupanca() {
    println("Digite o valor do seu depósito: ")
    var deposito = readln().toDouble()

    val rendimento = deposito * 1.3

    println("O valor do seu depósito com rendimento de 1,3% ao mês é de $rendimento")

}

// Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

fun quadrado(){
    println("Digite o valor do primeiro lado do quadrado: ")
    val lado1 = readln().toDouble()
    println("Digite o valor do primeiro lado do quadrado: ")
    val lado2 = readln().toDouble()

    var somaquadrado = (lado1 + lado2).pow(2.0)

    println("A soma do quadrado é de $somaquadrado")

}