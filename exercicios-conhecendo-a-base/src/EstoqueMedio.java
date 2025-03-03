/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque é de 5 unidades.
 * 
 * Passo 1: Ler a quantidade mínima e máxima do produto
 * Passo 2: Calcular o estoque médio
 * Passo 3: Imprimir uma mensagem para o usuário com o resultado
 */

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
   Scanner leia = new Scanner(System.in);
   int quantidadeMinima, quantidadeMaxima, estoqueMedio;
   
   System.out.println("Digite a Quantidade Mínima do Estoque:");
   quantidadeMinima = leia.nextInt();
   System.out.println("Digite a Quantidade Máxima do Estoque:");
   quantidadeMaxima = leia.nextInt();

   leia.close();

   estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

   System.out.printf("A quantidade mínima é %d, a quantidade máxima é %d : O estoque é de %d unidades.",quantidadeMinima,quantidadeMaxima,estoqueMedio);
    }
}
