import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        double temperaturaCelcius;
        double temperaturaFahrenheit;
        char resposta;

        System.out.println("Digite a temperatura em Celcius: ");
        temperaturaCelcius = leitor.nextDouble();

        do {
            temperaturaFahrenheit = (9 * temperaturaCelcius + 160) / 5;
            System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            resposta = leitor.next().charAt(0);

            if (resposta == 's') {
                System.out.println("Digite a temperatura em Celcius: ");
                temperaturaCelcius = leitor.nextDouble();
            } else {
                System.out.println("Fim");
            }
        } while (resposta == 's');

    }
}
