package estrutura_if;

import java.util.Scanner;

public class ChecadorDeIdadeTernario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();

        // If ternário: condição ? expressão1 : expressão2
        String mensagem = (idade >= 18) ? "Pode comprar o ingresso!" : "Esse filme é para maiores de 18 anos!";
        System.out.println(mensagem);

        leia.close();
    }
}
