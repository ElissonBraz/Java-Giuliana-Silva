/*
 * Exercício 1:
 * 
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * 1. Ler 3 notas
 * 2. Calcular média
 * 3. Imprimir resultado
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 */

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("Olá, Escreva as três notas d@ alun@: ");
        System.out.println("Primeira Nota: ");
        nota1 = leia.nextFloat();
        System.out.println("Segunda Nota: ");
        nota2 = leia.nextFloat();
        System.out.println("Terceira Nota: ");
        nota3 = leia.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média do Aluno é: %.2f%n", media);

        leia.close();

    }
}
