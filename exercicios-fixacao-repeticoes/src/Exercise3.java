import java.util.Scanner;
/*
 * Crie um programa Java que lê um número n (no exemplo abaixo n é igual a 5) e gera
 * um padrão de números crescentes da seguinte forma:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * Dica: Utilize loops aninhados para resolver o problema.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        leia.close();
    }
}
