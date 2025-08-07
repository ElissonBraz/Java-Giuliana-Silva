/*Sequência de Fibonacci
A Sequência de Fibonacci é uma série matemática em que cada
número subsequente é a soma dos dois números anteriores.
Começando com 0 e 1, os primeiros termos da sequência são 0, 1, 1, 2, 3, 5, 8, 13, 21 e
assim por diante. Por exemplo, dado o número 7, o termo fibonacci é 13.

Você deve criar um programa Java que permita
ao usuário informar um número e calcule o termo da Sequência de
Fibonacci correspondente a esse número inteiro positivo.
*/

import java.util.Scanner;

public class Exercise6 {
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        for (int i = 2; i <= n; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();

            System.out.println(fibonacci(num));


        }
}
