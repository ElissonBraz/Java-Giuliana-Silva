
package exercicios;

import java.util.Scanner;

/*
 * Dada a idade do atleta, imprima sua categoria: 
 * 
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */

public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        int idade = leia.nextInt();

        if (idade >= 10 && idade <= 12) {
            System.out.println(idade + " anos é um atleta de categoria Mirim!");
        } else if (idade >= 13 && idade <= 15) {
            System.out.println(idade + " anos é um atleta de categoria Infantil!");
        } else if (idade >= 16 && idade <= 18) {
            System.out.println(idade + " anos é um atleta de categoria Juvenil!");
        } else {
            System.out.println(idade + " anos não está classificado em nenhuma categoria disponível no sistema!");
        }

        leia.close();
    }
}
