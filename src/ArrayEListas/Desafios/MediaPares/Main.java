package ArrayEListas.Desafios.MediaPares;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int somaPares = 0;
        int qtdPares = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                qtdPares += 1;
                somaPares += vect[i];
            }
        }

        if (qtdPares == 0) {
            System.out.println("NENHUM ELEMENTO PAR...");
        } else {
            double media = (double) somaPares / qtdPares;

            System.out.printf("A MEDIA DOS PARES = %.1f %n", media);
        }

        sc.close();
    }
}
