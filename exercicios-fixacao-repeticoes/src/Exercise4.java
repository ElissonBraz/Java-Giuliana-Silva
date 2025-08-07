/* Imprimindo o maior número

Crie um programa Java que solicita ao usuário uma série de números e quando ele digitar
um número negativo, o programa irá encerrar e imprimir o maior número entre os digitados.
Você deve utilizar estruturas de repetição para coletar
os números e determinar qual é o maior.

Ex: Suponha que o usuário insira os seguintes números:
 5, 12, 8, 25, 3, -1. A saída do programa deve ser: 25.

Importante: Imprima apenas o maior número e nenhum texto adicional!
 */

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int maior = 0;
        int num;

        while (true) {
            num = leia.nextInt();
            if (num < 0) {
                break;
            }
            if (num > maior) {
                maior = num;
            }
        }

        if(maior < 0) {
            System.out.println(num);
        } else {
            System.out.println(maior);
        }
        leia.close();



    }
}
