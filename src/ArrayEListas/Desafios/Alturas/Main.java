package ArrayEListas.Desafios.Alturas;

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
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getAltura();
        }

        double alturaMedia = 0;
        for (int i = 0; i < vect.length; i++) {
            alturaMedia = sum / vect.length;
        }

        int pessoasMenorDe16 = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getIdade() < 16) {
                pessoasMenorDe16++;
            }
        }
        double porcentagem = (double) pessoasMenorDe16 / vect.length * 100;

        System.out.printf("Altura media: %.2f %n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", porcentagem);

        for (int i =0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
