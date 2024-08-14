import java.util.Scanner;

public class EstruturaCondicional2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int diaSemana = 0;

        System.out.println("QUAL DIA DA SEMANA É?");
        diaSemana = leitor.nextInt();

        while (diaSemana == 0) {
            System.out.println("voce precisa informar algum dia");
            diaSemana = leitor.nextInt();
        }
        switch (diaSemana) {
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3:
                System.out.println("Hoje é Terça");
                break;
            case 4:
                System.out.println("Hoje é Quarta");
                break;
            case 5:
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");
                break;
            case 7:
                System.out.println("Hoje é Sabado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

    }
}
