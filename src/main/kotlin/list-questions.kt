import kotlin.math.pow
import kotlin.math.sqrt


class Pessoa(val primeiroNome: String) {
    fun correr() {
        println("Estou correndo $primeiroNome")
    }
}

fun main() {
    idadeatual()

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

// Receba 2 números reais. Calcule e mostre a diferença desses valores.

fun numeroreal() {
    println("Digite o valor de x: ")
    val x1 = readln().toDouble()
    println("Digite o valor de y: ")
    val x2 = readln().toDouble()

        if (x1 > x2) {
            println("$x1 é maior que $x2")
        }
        else {
            println("$x2 é menor que $x1")
        }
}

// Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. (C = 2 * PI * diametro)

fun circunferencia() {
    println("Digite o diametro da circunferência: ")
    val diametro = readln().toDouble()

    var compcircunferia = 2 * 3.14 * diametro

    println("O comprimento da circunferência é de $compcircunferia" + "m")
}

// Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.

fun idadeatual() {
    println("Digite o ano nascimento: ")
    val anonascimento = readln().toDouble()
    println("Digite o ano atual: ")
    val anoatual = readln().toDouble()

    var idadeatual = anoatual - anonascimento
    var idadefutura = anoatual - anonascimento + 17

    println("Sua idade atual é $idadeatual mas daqui 17 anos você terá $idadefutura")

}

// Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.