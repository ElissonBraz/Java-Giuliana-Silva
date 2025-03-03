import java.util.Scanner;
/*
 * Escreva um programa Java que imprima a soma dos números de 1 até um número inteiro e positivo n, onde
 * n é fornecido pelo usuário. O programa deve solicitar ao usuário que insira o valor de n e, em seguida, 
 * calcular e exibir a soma dos números de 1 até n.
 * 
 * Ex: Se n = 5, a soma de 1 a n será 15.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
            soma += i;
            System.out.println("soma = " + soma);
        }
        System.out.println("soma final = " + soma);

        leia.close();
    }
}
