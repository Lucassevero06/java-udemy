import java.util.Scanner;

public class OperadoresDeAtribuicaoAcumulativa {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double planoBasico = 50.00;
        int minutosTelefone = 0;
        int minutosAMais = 0;

        System.out.println("Quantos minutos deseja usar?");
        minutosTelefone = leitor.nextInt();
        
        if (minutosTelefone <= 0) {
            System.out.println("Voce não tem nada a pagar, pois não usou nenhum minuto");
        } else if (minutosTelefone <= 100) {
            System.out.printf("Valor a pagar $ %.2f", planoBasico);
        } else {
            for (int i = 0; i < (minutosTelefone - 100); i++) {
                minutosAMais++;
            }
            System.out.printf("Valor a pagar $ %.2f", planoBasico + (minutosAMais * 2.00));
        }

        leitor.close();

    }
}
