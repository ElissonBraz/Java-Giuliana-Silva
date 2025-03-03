package exercicios;

import java.util.Scanner;
/*
 * Dada uma figura geométrica (retângulo, triângulo, círculo), selecione a sua área.
 * 
 * retangulo = base x altura
 * triangulo = (base x altura) / 2
 * circulo = pi x (raio * raio)
 */
public class AreaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        float base, altura, pi;
        int figura;

        System.out.println("Bem vindo ao programa de figura Geométrica!");
        System.out.println("Informe a figura desejada entre: Retângulo = 1, Triângulo = 2 ou Circulo = 3");
        figura = leia.nextInt();
        if (figura == 1) {
            System.out.print("Informe os dados do Retângulo primeiro a base: ");
            base = leia.nextFloat();
            System.out.print("Informe os dados do Retângulo agora a altura: ");
            altura = leia.nextFloat();
            float retangulo = base * altura;
            System.out.printf("A area do Retângulo é: %.2f", retangulo);
        } else if (figura == 2) {
            System.out.print("Informe os dados do Triângulo primeiro a base: ");
            base = leia.nextFloat();
            System.out.print("Informe os dados do Triângulo agora a altura: ");
            altura = leia.nextFloat();
            float triangulo = (base * altura) / 2;
            System.out.printf("A area do Triângulo é: %.2f", triangulo);
        } else if (figura == 3) {
            System.out.print("Informe os dados do Circulo no caso o raio: ");
            float raio = leia.nextFloat();
            pi = 3.14f;
            float circulo = pi * (raio * raio);
            System.out.printf("A area do Circulo é: %.2f", circulo);
        } else {
            System.out.println("Figura informada não é válida!");
        }


        leia.close();
    }
}
