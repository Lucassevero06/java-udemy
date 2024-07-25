import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        // declarando a variável do tipo Scanner
        Scanner sc = new Scanner(System.in);

        //declarando as variaveis que serão usadas
        int x;
        String s1, s2, s3;

        // capturando o valor delas
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        // exibindo os valores delas
        System.out.println("Voce digitou: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
