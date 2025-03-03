/*
 * Faça um programa que converta um valor em dólar em reais.
 * 
 * Ex: Dólares = 100, Cotação = 4,92 => O valor em reais é R$ 492,00.
 */

import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float valorEmDolar, cotacaoDoDolar, valorEmReal;

        System.out.println("Digite o valor em Dólar:");
        valorEmDolar = leia.nextFloat();
        System.out.println("Digite o valor da cotação do Dólar:");
        cotacaoDoDolar = leia.nextFloat();
        leia.close();
        
        valorEmReal = valorEmDolar * cotacaoDoDolar;

        System.out.printf("Dólares : R$ %.2f ,Cotação : R$ %.2f ,Logo o valor em reais é R$ %.2f.", valorEmDolar, cotacaoDoDolar, valorEmReal);
    }
}
