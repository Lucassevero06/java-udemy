package ArrayEListas.Desafios;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int numerosPares = 0;
        System.out.println("Numeros pares: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                numerosPares++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de Pares = " + numerosPares);

        sc.close();
    }
}
