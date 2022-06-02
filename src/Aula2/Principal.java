package Aula2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();
        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);

    }
}
