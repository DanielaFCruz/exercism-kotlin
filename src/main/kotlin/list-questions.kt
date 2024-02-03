import java.lang.NullPointerException
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    ordemcrescente2()

}

// Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

fun quadrado1() {
    println("Digite o primeiro lado de um quadrado: ")
    var lado1 = readln().toDouble()
    println("Digite o segundo lado de um quadrado: ")
    var lado2 = readln().toDouble()

    val area = lado1 * lado2

    println("O valor da área do quadrado é de $area")
}

// Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

fun reajuste() {
    println("Digite o seu salário: ")
    var salario = readln().toDouble()

    val novosalario = 1.15 * salario

    println("O valor do seu salário reajustado em 15% é de $novosalario")

}

// Receba a base e a altura de um triângulo. Calcule e mostre a sua área.

fun triangulo() {
    println("Digite a base do triângulo: ")
    var base = readln().toDouble()
    println("Digite a altura do triângulo: ")
    var altura = readln().toDouble()

    val area = (altura * base) / 2

    println("A área do triângulo é de $area")

}

// Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

fun celsius() {
    println("Digite a temperatura em Celsius: ")
    var celsius = readln().toDouble()

    val fahrenheit = (celsius * 1.8) + 32

    println("O valor da temperatura é $fahrenheit")
}

// Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).

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

// Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

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

fun alimento() {
    println("Digite a quantidade de alimentos em quilos: ")
    var qtdaquilos = readln().toDoubleOrNull()

    if (qtdaquilos != null && qtdaquilos > 0) {
        val gramasdia = 50.0
        val qtdagramas = qtdaquilos * 1000
        val diasduracao = qtdagramas / gramasdia

        println("O alimento durará aproximadamente $diasduracao dias")
        }
      else {
        println("Não é válido, por favor digite um número válido")
    }
}

// Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. Caso seja a hipotenusa: c = √(a² + b²)

fun angulotriangulo() {
    println("Digite o valor do primeiro ângulo: ")
    var primeiroanguloA = readln().toDouble()
    println("Digite o valor do segundo ângulo: ")
    var segundoanguloB = readln().toDouble()

    if (primeiroanguloA > 0 && segundoanguloB > 0) {
        val terceiroanguloH = (primeiroanguloA.pow(2.0) + segundoanguloB.pow(2.0)).pow(2.0)

        println("O valor do terceiro angulo é de $terceiroanguloH")
    } else {
        println("Por favor, digite um valor válido")
    }


}

// Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa. h = √(a² + b²)

fun hipotenusa() {
    println("Digite o valaor do primeiro cateto: ")
    var cateto1 = readln().toDouble()
    println("Digite o valaor do segundo cateto: ")
    var cateto2 = readln().toDouble()

    val hipotenusa = sqrt(cateto1 * cateto1 + cateto2 * cateto2)

    println("A hipotenusa é $hipotenusa")
}

// Exercício 16

fun salario() {
    println("Digite a quantidade de horas trabalhadas: ")
    var horastrabalhadas = readln().toDouble()
    println("Digite o valor por hora: ")
    var valorhora = readln().toDouble()
    println("Digite o percentual de desconto: ")
    var percentualdesconto = readln().toDouble()
    println("Digite o número de dependentes.: ")
    var dependentes = readln().toDouble()

    if (horastrabalhadas != null && valorhora != null && percentualdesconto != null && dependentes != null) {
        val salariobruto = horastrabalhadas * valorhora
        val desconto = (percentualdesconto / 100) * salariobruto
        val salarioliquido = (salariobruto - desconto) + (dependentes * 100)

        println("O salário a receber é de $salarioliquido")
        } else {
            println("Digite um número válido")
    }
}

// Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média

fun litrosgastos() {
    println("Digite o tempo do percurso: ")
    var tempopercurso = readln().toDouble()
    println("Digite a velocidade média: ")
    var velocidademedia = readln().toDouble()

    val litros = (tempopercurso * velocidademedia) / 12

    println("A quantidade de litros gastos é de $litros")
}

// Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.

fun diferencainteiro() {
    println("Digite o primeiro valor: ")
    var primeirovalor = readln().toDouble()
    println("Digite a segundo valor: ")
    var segundovalor = readln().toDouble()

    if (primeirovalor != null && segundovalor != null) {
        val diferenca = if (primeirovalor > segundovalor)
            primeirovalor - segundovalor
        else {
            segundovalor - primeirovalor
        }
        println("A diferença entre o maior e o menor valor é: $diferenca")
        } else  {
        println("Escreva um número válido")
    }
}

// Receba 2 valores reais. Calcule e mostre o maior deles.

fun real() {
    println("Digite o primeiro valor real: ")
    var primeiroreal = readln().toDouble()
    println("Digite a segundo valor real: ")
    var segundoreal = readln().toDouble()

    if (primeiroreal != null && segundoreal != null) {
        val diferenca = if (primeiroreal > segundoreal)
            println("$primeiroreal é maior que $segundoreal")
        else {
            println("$segundoreal é maior que $primeiroreal")
        }
    } else {
        println("Digite um número válido")
    }
}

// Exercício 20

fun equacaosegundograu() {
    println("Digite o coeficiente a: ")
    var coeficienteA = readln().toDouble()
    println("Digite o coeficiente b: ")
    var coeficienteB = readln().toDouble()
    println("Digite o coeficiente c: ")
    var coeficienteC = readln().toDouble()

    if (coeficienteA != null && coeficienteB != null && coeficienteC != null){
        val delta = coeficienteB.pow(2.0) - (4 * coeficienteA * coeficienteC)
            if (delta >= 0){
                val x1 = (- coeficienteB + sqrt(delta)) / 2 * coeficienteA
                val x2 = (- coeficienteB - sqrt(delta)) / 2 * coeficienteA

                println("As raízes reais são: x1: $x1 e x2: $x2")
                } else {
                    println("A equação não possuí raízes reais")
            }
    } else {
        println("Digite um valor válido")
    }
}

// Exercício 21:

fun notasbimestrais() {
    println("Digite sua nota de matemática: ")
    var notamatematica = readln().toDouble()
    println("Digite sua nota de física: ")
    var notafisica = readln().toDouble()
    println("Digite sua nota de química: ")
    var notaquimica = readln().toDouble()
    println("Digite sua nota de português: ")
    var notaportugues = readln().toDouble()

    if (notamatematica != null && notafisica != null && notaquimica != null && notaportugues != null) {
        val media = (notamatematica + notafisica + notaquimica + notaportugues) / 4

        println("A média aritmetica é $media")

        when {
            media >= 6.0 -> println("APROVADO")
            media >= 3.0 -> println("EXAME")
            else -> println("RETIDO")
            }
    }

}

// Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

fun ordemcrescente() {
    println("Digite o primeiro valor inteiro: ")
    var primeirovalor = readln().toDouble()
    println("Digite o segundo valor inteiro: ")
    var segundovalor = readln().toDouble()

    if (primeirovalor != null && segundovalor != null){
        val crescente = if (primeirovalor > segundovalor) {
            Pair(primeirovalor, segundovalor)
        } else {
            Pair(segundovalor, primeirovalor)
        }
        println("Os valores em ordem crescente são: $crescente")
    }

}

// Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.

fun ordemcrescente2() {
    println("Digite o primeiro valor: ")
    var primeirovalor = readln().toDouble()
    println("Digite o segundo valor maior que o primero: ")
    var segundovalor = readln().toDouble()
    println("Digite o terceiro valor maior que o segundo: ")
    var terceirovalor = readln().toDouble()

    if (primeirovalor < segundovalor && segundovalor < terceirovalor) {
        println("Digite o quarto valor inteiro: ")
        var quartovalor = readln().toDouble()
        if (quartovalor < primeirovalor) {
            println("$quartovalor, $primeirovalor, $segundovalor, $terceirovalor")
        }

        if (quartovalor > primeirovalor && quartovalor < segundovalor) {
            println("$primeirovalor, $quartovalor, $segundovalor, $terceirovalor")
        }

        if (quartovalor > segundovalor && quartovalor < terceirovalor) {
            println("$primeirovalor, $segundovalor, $quartovalor, $terceirovalor")
        }

        if (quartovalor > terceirovalor)
            println("$primeirovalor, $segundovalor, $terceirovalor, $quartovalor")

    } else {
        println("Os números não foram digitados na ordem crescente")
    }

    }
fun ordemcrescenteexample() {
    println("Digite o primeiro valor inteiro: ")
    val primeirovalor = readln().toDouble()
    println("Digite o segundo valor inteiro: ")
    val segundovalor = readln().toDouble()
    println("Digite o terceiro valor inteiro: ")
    val terceirovalor = readln().toDouble()
    println("Digite o segundo valor inteiro: ")
    val quartovalor = readln().toDouble()

    if (primeirovalor != null && segundovalor != null && terceirovalor != null && quartovalor != null && primeirovalor > segundovalor && segundovalor > terceirovalor){
        val crescente = listOf(primeirovalor, segundovalor, terceirovalor, quartovalor).sorted()

        println("Segue ordem crescente: $primeirovalor, $segundovalor, $terceirovalor, $quartovalor")
    } else {
        println("Digite valores válidos")
    }
}

// Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

fun divisao() {
    println("Digite um valor inteiro: ")
    var valor = readln().toInt()

    if ((valor % 2 == 0) && (valor % 3 == 0)) {
        println("$valor é divisível por 2 e 3")
    } else {
        println("$valor não é divisível por 2 e 3")
    }
}
