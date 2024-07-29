package ArrayEListas;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n]; //criando um vetor, ele exige o tamanho dele

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble(); // fazendo um loop para pecorrer o vetor e inserindo os valores dentro do vetor em seus respectivos indices
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("Average height: %.2f %n", avg);
        sc.close();

        /*
        * VETORES:
        *
        *   -em programação, "vetor" é o nome dado a arranhos unidimensionais
        *
        *   -Arranjo (array) é uma estrutura de dados:
        *       -homogenea (dados do mesmo tipo)
        *       -ordenada (elementos acessados por meio de posições)
        *       -alocada de uma vez só, em um bloco contiguo de memória
        *
        *   -Vantagens:
        *       -acesso imediato aos elementos pela sua posição
        *
        *   -Desvantagens:
        *       -tamanho fixo
        *       -dificuldadade para se realizar inserções e deleções
        *
        * */

    }
}
