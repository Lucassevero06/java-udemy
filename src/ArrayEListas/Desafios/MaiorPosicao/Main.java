package ArrayEListas.Desafios.MaiorPosicao;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double maxNumber = Arrays.stream(vect).max().orElse(Double.NaN); //encontra o maior valor no vetor.

        int maxIndex = -1;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == maxNumber) {
                maxIndex = i;
                break;
            }
        }

        System.out.println("MAIOR VALOR = " + maxNumber);

        System.out.println("POSIÇÃO DO MAIOR VALOR = " + maxIndex);

        sc.close();
    }
}
