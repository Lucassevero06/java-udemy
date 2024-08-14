package ArrayEListas.Desafios.Pensionato;

import ArrayEListas.Desafios.Pensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10]; // criando vetor com 10 posicoes

        System.out.println("How many rooms will be rentedes?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            vect[roomNumber] = new Rent(name, email); // instanciando objeto e já incluindo no array
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]); // imprimindo apenas os indices que contem objetos
            }
        }

        sc.close();
    }
}
