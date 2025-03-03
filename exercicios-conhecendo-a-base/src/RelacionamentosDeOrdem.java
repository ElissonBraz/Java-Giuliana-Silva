/*
 * Escrava um programa que informe os relacionamentos de ordem existentes
 * Igual, não Igual, maior, menor, maior ou igual, menor ou igual.
 * 
 * 1. Ler 2 números
 * 2, Imprimir relacionamentos de ordem
 * 
 * Ex: Dados os números 2 e 3:
 * 2 = 3 ? false, 2 != 3 ? true, ... , 2 <= 3 ? true
 */

import java.util.Scanner;

public class RelacionamentosDeOrdem {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite dois números: ");
        numero1 = leia.nextInt();
        numero2 = leia.nextInt();
        System.out.println("Dados os números " + numero1 + " e " + numero2 + " :");

        leia.close();

        if (numero1 == numero2) {
            System.out.println(numero1 + " = " + numero2 + " ? true");
        } else {
            System.out.println(numero1 + " = " + numero2 + " ? false");
        }
        if (numero1 != numero2) {
            System.out.println(numero1 + " != " + numero2 + " ? true");
        } else {
            System.out.println(numero1 + " != " + numero2 + " ? false");
        }
        if (numero1 < numero2) {
            System.out.println(numero1 + " < " + numero2 + " ? true");
        } else {
            System.out.println(numero1 + " < " + numero2 + " ? false");
        }
        if (numero1 > numero2) {
            System.out.println(numero1 + " > " + numero2 + " ? true");
        } else {
            System.out.println(numero1 + " > " + numero2 + " ? false");
        }
        if (numero1 <= numero2) {
            System.out.println(numero1 + " <= " + numero2 + " ? true");
        } else {
            System.out.println(numero1 + " <= " + numero2 + " ? false");
        }
        if (numero1 >= numero2) {
            System.out.println(numero1 + " >= " + numero2 + " ? true");
        } else {
            System.out.println(numero1 + " >= " + numero2 + " ? false");
        }

    }
}
