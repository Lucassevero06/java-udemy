import java.util.Scanner;
import java.util.Locale;

public class EntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        System.out.println("Digite algo: ");

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Voce digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        // informando a linguagem de que a partir daqui não será mais usado objeto sc (Scanner)
        sc.close();
    }
}
