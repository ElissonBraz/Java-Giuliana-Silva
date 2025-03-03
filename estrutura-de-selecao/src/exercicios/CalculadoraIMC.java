package exercicios;
import java.util.Scanner;
/*
 * Crie uma calculadora de IMC que mostra em que classificação a pessoa está:
 * 
 * Menor que 18,5    -> MAGREZA
 * Entre 18,5 e 24,9 -> NORMAL
 * Entre 25 a 29,9   -> SOBREPESO
 * Entre 30 a 39,9   -> OBESIDADE
 * Maior que 40      -> OBESIDADE GRAVE
 * 
 * IMC  = peso  / altura * altura
 * 
 */
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo a calculado de IMC");
        System.out.print("Por favor digite seu peso: ");
        float peso = leia.nextFloat();
        System.out.print("Por favor agora digite sua altura: ");
        float altura = leia.nextFloat();

        float IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Sua classificação é MAGREZA!");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Sua classificação é NORMAL!");
            
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sua classificação é SOBREPESO!");
            
        } else if (IMC >= 30 && IMC <= 39.9) {
            System.out.println("Sua classificação é OBESIDADE!");
            
        } else {
            System.out.println("Sua classificação é OBESIDADE GRAVE!");
        }

        leia.close();
    }
}
