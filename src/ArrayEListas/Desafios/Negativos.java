package ArrayEListas.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println();
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.print("Numeros negativos: ");
        System.out.println();

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
