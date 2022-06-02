package Aula3;

public class ContaBancaria {
    String numero;
    double saldo;

    public double debitar(double valor){
        saldo = saldo - valor;
        return saldo;
    }
    public double creditar(double valor){
        saldo = saldo + valor;
        return saldo;
    }
}
