package POO.desafioBanco.entities;

public class Conta {

    private final int NUMERO_CONTA;
    private Titular titular;
    private double saldo;

    public Conta(int numeroConta, Titular titular, double saldo) {
        this.NUMERO_CONTA = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, Titular titular) {
        this.NUMERO_CONTA = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return this.NUMERO_CONTA;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return this.titular.getNome();
    }

    public double depositar(double deposito) {
        this.saldo += deposito;
        return this.saldo;
    }

    public double sacar(double saque) {
        this.saldo -= saque + 5.0;
        return this.saldo;
    }
}
