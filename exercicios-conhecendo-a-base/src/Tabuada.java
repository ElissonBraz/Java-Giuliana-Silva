/*
 * Imprimir a tabuada de um número
 * 
 * 1. Ler um número
 * 2. Imprimir sua tabuada
 * 
 * 1 a 10 : 1 x 1 = 1, 1 x 2 = 2, ... 1 x 10 = 10.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero, valor, contador = 0;

        System.out.println("Digite um número para saber sua tabuada: ");
        numero = leia.nextInt();

        leia.close();

        while (contador < 10) {
            contador++;
            valor = numero * contador;
            System.out.println(numero + " X " + contador + " = " + valor);
        }

    }
}
