/*
 * Escreva um programa que leia uma idade em anos e imprima
 * essa idade em dias.
 * 
 * Ex: 1 ano => 365 dias de idade.
 */

import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idade, dias;

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        leia.close();

        dias = idade * 365;

        System.out.printf("Sua idade em dias é: " + dias);

    }
}
