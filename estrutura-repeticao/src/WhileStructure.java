import java.util.Scanner;

public class WhileStructure {
    public static void main(String[] args) {

        int numero = 7, tentativas = 5;
        Scanner leia = new Scanner(System.in);

        while (tentativas > 0) {
            System.out.println("Digite um número de 1 a 10: ");
            int numeroFornecido = leia.nextInt();
            if (numeroFornecido == numero) {
                System.out.println("Você acertou! :)");
                return;
            } else {
                tentativas--;
            }
        }

        leia.close();
    }
}
