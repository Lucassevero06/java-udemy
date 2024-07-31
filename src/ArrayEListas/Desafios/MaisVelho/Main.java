package ArrayEListas.Desafios.MaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %d pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            vect[i] = new Pessoa(nome, idade);
        }

        sc.close();
    }
}
