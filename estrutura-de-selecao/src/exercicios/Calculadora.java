
package exercicios;

import java.util.Scanner;

/*
 * Crie uma calculadora que calcule dados de 2 números e uma operação
 * (adição, subtração, multiplicação e divisão), retorne o
 * resultado dessa operação entre os dois números.
 * 
 * Ex:
 *    1 2 *=> 1 * 2 = 2
 *    8 2 / => 8 / 2 = 4
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.print("Bem Vindo a Calculadora Digite o primeiro número: ");
        int numeroUm = leia.nextInt();
        System.out.print("Por favor digite o segundo número: ");
        int numeroDois = leia.nextInt();
        System.out.println("Por favor escolha um dos operadores que são:");
        System.out.println("+ para Adição; - para Subtração; * para Multiplicação e / para Divisão.");
        System.out.print("Por favor Digite o operador matématico valído: ");
        char operador = leia.next().charAt(0);

        if (operador == '+') {
            int soma = numeroUm + numeroDois;
            System.out.println("O resultado da soma é: " + soma);
        } else if (operador == '-') {
            int subtracao = numeroUm - numeroDois;
            System.out.println("O resultado da subtração é: " + subtracao);
        } else if (operador == '*') {
            int multiplicao = numeroUm * numeroDois;
            System.out.println("O resultado da multiplição é: " + multiplicao);
        } else if (operador == '/' && numeroDois != 0) {
            int divisao = numeroUm / numeroDois;
            System.out.println("O resultado da divisão é: " + divisao);
        } else {
            System.out.println("Operador Logico Invádido!");
        }

        leia.close();
    }
}
