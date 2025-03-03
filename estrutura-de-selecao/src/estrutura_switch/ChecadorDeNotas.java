package estrutura_switch;

import java.io.Console;

public class ChecadorDeNotas {

    public static void main(String[] args) {
        // A, B, C, D ou F
        Console console = System.console();

        System.out.println("Informe a nota (A, B, C, D, F): ");
        String nota = console.readLine();
        String mensagem = switch (nota) {
            case "A" -> "Excelent! ";
            case "B" -> "Bom trabalho! ";
            case "C" -> "Está progredindo! ";
            case "D" -> "Precisa melhorar! ";
            case "F" -> "Você falhou! ";
            default -> "Opção inválida! ";
        };
        System.out.println(mensagem);
    }
}
