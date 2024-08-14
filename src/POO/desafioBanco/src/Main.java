package POO.desafioBanco.src;

import POO.desafioBanco.entities.Conta;
import POO.desafioBanco.entities.Titular;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double saldo = 0;

        System.out.println("Bem-vindo ao sistema de banco POO!");
        System.out.println("Preciso de algumas informações para a criação de sua conta!");

        System.out.println("Por favor digite o numero da sua conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor digite seu primeiro nome: ");
        String primeiroNome = sc.next();

        System.out.println("Por favor digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Deseja fazer um saque inicial? (s/n)");
        String resposta = sc.next();

        if(resposta.charAt(0) == 's') {
            System.out.println("Por favor digite o valor inicial: ");
            saldo = sc.nextDouble();
        } else if(resposta.charAt(0) == 'n') {
            System.out.println("Ok prossiga!");
            saldo = 0;
        }

        Conta conta;
        Titular titular;
        titular = new Titular(primeiroNome, sobrenome);
        conta = new Conta(numeroConta, titular, saldo);

        System.out.printf("Conta: %d, Titular: %s, Saldo: R$ %.2f %n", conta.getNumeroConta(), conta.getNomeTitular(), conta.getSaldo());

        System.out.println("Seja bem-vindo(a) " + conta.getNomeTitular() + "!");

        System.out.println("Deposite um valor");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println("Deposito realizado!");

        System.out.printf("Conta: %d, Titular: %s, Saldo: R$ %.2f %n", conta.getNumeroConta(), conta.getNomeTitular(), conta.getSaldo());

        System.out.println("Saque um valor");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println("Saque realizado!");

        System.out.printf("Conta: %d, Titular: %s, Saldo: R$ %.2f %n", conta.getNumeroConta(), conta.getNomeTitular(), conta.getSaldo());

        sc.close();
    }
}
