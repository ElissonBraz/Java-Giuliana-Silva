/*
 * Crie um programa que leia um nome e imprima uma saudação utilizando o
 * Console ao invés do Scanner.
 * 
 * Javadoc: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Console.html
 */

import java.io.Console;

public class SaudacaoConsole {
    public static void main(String[] args) {
        Console tela = System.console();

        System.out.println("Qual o seu nome? ");
        String nome = tela.readLine();
        System.out.println("Olá, " + nome);
    }
}
