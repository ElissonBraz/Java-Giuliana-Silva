package exercicios;

/*
 * Leia 3 números e imprima-os em ordem crescente.
 */

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int primeiro, segundo, terceiro;

        System.out.print("Digite o primeiro número: ");
        primeiro = leia.nextInt();
        System.out.print("Digite o segundo número: ");
        segundo = leia.nextInt();
        System.out.print("Digite o terceiro número: ");
        terceiro = leia.nextInt();

        if (primeiro < segundo && primeiro < terceiro) {
            if (segundo < terceiro) {
                System.out.println(primeiro + " " + segundo + " " + terceiro);
            } else {
                System.out.println(primeiro + " " + terceiro + " " + segundo);
            }
        } else if (segundo < primeiro && segundo < terceiro) {
            if (primeiro < terceiro) {
                System.out.println(segundo + " " + primeiro + " " + terceiro);
            } else {
                System.out.println(segundo + " " + terceiro + " " + primeiro);
            }
        } else {
            if (primeiro < segundo) {
                System.out.println(terceiro + " " + primeiro + " " + segundo);
            } else {
                System.out.println(terceiro + " " + segundo + " " + primeiro);
            }
        }

        leia.close();
    }
}
