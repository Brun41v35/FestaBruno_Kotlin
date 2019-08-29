//Importações
import java.util.Scanner

fun main(args: Array<String>) {

    //Variaveis
    val nome: String
    val resposta = Scanner(System.`in`)
    val resposta2 = Scanner(System.`in`)
    val idade: Int
    val conheceDono: String

    //Entrada de dados
    println("Olá, bem-vindo a minha festa!!! Lembrando que só pode entrar quem é maior de 18 anos hein!!!")
    println("Qual é o seu nome: ")
    nome = resposta.nextLine()

    println("Prazer $nome!! Quantos anos você tem: ")
    idade = resposta.nextInt()

    //Processamento - Saida de dados
    if (idade >= 18) {
        println("Beleza, aproveita $nome")
    } else {
        println("Você não tem idade suficiente.. ")
    }

    println("Conhece pelo menos o dono da festa: ")
    conheceDono = resposta2.nextLine()

    if (conheceDono.equals("Sim")) {
        println("Então tranquilo, aproveite a festa $nome")
    } else {
        println("Putz, infelizmente você não pode entrar..")
    }
}