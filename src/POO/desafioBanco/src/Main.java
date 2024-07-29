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

        System.out.println("Por favor digite seu nome: ");
        String nomeTitular = sc.next();

        System.out.println("Deseja fazer um saque inicial? (s/n)");
        String resposta = sc.nextLine();

        if(resposta.charAt(0) == 's') {
            System.out.println("Por favor digite o valor inicial: ");
            saldo = sc.nextDouble();
        } else if(resposta.charAt(0) == 'n') {
            System.out.println("Ok prossiga!");
            saldo = 0;
        }

        Conta conta;
        Titular titular;
        titular = new Titular(nomeTitular);
        conta = new Conta(numeroConta, titular, saldo);

        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getNomeTitular());
        System.out.println(conta.getSaldo());

        sc.close();
    }
}
