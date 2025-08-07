/*Fatorial
Você deve criar um programa Java que permita ao usuário calcular o fatorial
de um número inteiro positivo. Lembre-se de que o fatorial de um
número n é o produto de todos os inteiros positivos de 1 a n.

Por exemplo, se o usuário informar o número 7, o programa deve imprimir o fatorial de 7 que é 5040.
 */


import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        System.out.println(resultado);
        leia.close();
    }
}
