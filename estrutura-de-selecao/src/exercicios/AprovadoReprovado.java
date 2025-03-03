package exercicios;
/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Valor da nota digitada.
        float primeira, segunda, terceira, media;

        System.out.println("----------------------------------------");
        System.out.println("Bem vindo ao programa de calculo de nota!");
        System.out.print("Por favor insira a primeira nota: ");
        primeira = leia.nextFloat();
        System.out.print("Por favor insira a segunda nota: ");
        segunda = leia.nextFloat();
        System.out.print("Por favor insira a terceira nota: ");
        terceira = leia.nextFloat();

        media = (primeira + segunda + terceira) / 3.0f;

        if (media >= 7.0) {
            System.out.println("Aluno Aprovado! :)");
        } else {
            System.out.println("Aluno Reprovado! :(");
        }

        leia.close();
    }
}