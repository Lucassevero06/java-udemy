package POO.desafioCotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cotacaoDolar, qtdDolares;

        System.out.println("What is the dollar price?");

        cotacaoDolar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");

        qtdDolares = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = $ %.2f", CurrencyConverter.converter(cotacaoDolar, qtdDolares));

        sc.close();
    }
}
