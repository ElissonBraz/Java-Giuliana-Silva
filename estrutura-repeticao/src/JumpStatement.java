import java.util.Scanner;

public class JumpStatement {
    public static void main(String[] args) {
        // continue
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        // break
        Scanner leia = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número: ");
            int numero = leia.nextInt();

            if (numero == 1) {
                break;
            }
        }
        System.out.println("Ufa, acabou o loop! ");

        // return
        while (true) {
            System.out.println("Digite um número: ");
            int numero = leia.nextInt();

            if (numero == 1) {
                System.out.println("Ufa, acabou o loop! ");
                leia.close();
                return;
            }
        }
    }
}
