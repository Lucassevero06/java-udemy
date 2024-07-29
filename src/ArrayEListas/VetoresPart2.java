package ArrayEListas;

import POO.desafioProduto.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VetoresPart2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;
        System.out.printf("Average price: %.2f %n", avg);

        sc.close();
        /*
        *CHECKLIST:
        *
        *   -revisão do conceito de vetor
        *   -declaração e instanciação
        *   -manipulação de vetor de elementos tipo valor (tipo primitivo)
        *   -manipulação de vetor de elementos tipo referencia (classe)
        *   -acesso aos elementos
        *   -propriedade length
        *
        * */

    }
}
