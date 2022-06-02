package Aula3;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numero = "123-4";
        conta.saldo = 100.0;
        System.out.println(conta.saldo);
        conta.creditar(150.0);
        System.out.println(conta.saldo);
        conta.debitar(25.40);
        System.out.println(conta.saldo);
    }
}
