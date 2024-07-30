package ArrayEListas.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double media = 0;
        for(int i = 0; i < vect.length; i++) {
            media = sum / vect.length;
        }

        System.out.println("Valores: ");
        for(int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println();

        System.out.println("Soma: " + sum);
        System.out.println("Media: " + media);

        sc.close();
    }
}
