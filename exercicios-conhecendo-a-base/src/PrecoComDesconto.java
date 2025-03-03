/*
 * Imprimir preço de um produto com base no desconto à vista e o valor economizado.
 * 
 * 1. Ler preço
 * 2. Ler % de desconto
 * 3. Imprimir novo preço e valor economizado em reais
 * 
 * Ex: R$ 100,00 com 10% de desconto = 0 preço com desconto é R$ 90,00
 * e o valor economizado foi R$ 10,00
 */

import java.util.Scanner;

public class PrecoComDesconto {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leia =  new Scanner(System.in);
        float preco, precoComDesconto, valorEconomizado, descontoPorcento, desconto;

        System.out.println("Digite o Preço do produto em R$:");
        preco = leia.nextFloat();
        System.out.println("Digite o desconto a ser dado em %:");
        desconto = leia.nextFloat();

        leia.close();

        descontoPorcento = desconto / 100;

        valorEconomizado = preco * descontoPorcento;
        precoComDesconto = preco - valorEconomizado;
        
      System.out.printf("R$ %.2f com %.0f por cento de desconto : O preço com desconto é R$ %.2f e o valor economizado foi R$ %.2f",preco ,desconto ,precoComDesconto, valorEconomizado);
    } 
}
