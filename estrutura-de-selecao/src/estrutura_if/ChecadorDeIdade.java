package estrutura_if;

import java.util.Scanner;

public class ChecadorDeIdade {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();

        Boolean ehMaiorDeIdade = idade >= 18;
        if (ehMaiorDeIdade) {
            System.out.println("Pode comprar o ingresso!");
        } else {
            System.out.println("Esse filme é para maiores de 18 anos!");
        }

        leia.close();
    }
}
