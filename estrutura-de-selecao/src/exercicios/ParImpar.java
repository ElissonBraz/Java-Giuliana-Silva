package exercicios;

import java.util.Scanner;

/*
 * Leia um número e imprima se ele é par ou ímpar.
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + "é um número ímpar.");
        }

        leia.close();
    }
}
