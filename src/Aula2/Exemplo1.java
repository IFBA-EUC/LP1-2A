package Aula2;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        do {
            numero = leitor.nextInt();
            if(numero > 0) {
                System.out.println(numero / 2);
            }
        }while(numero > 0);
    }

}
