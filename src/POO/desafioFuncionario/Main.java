package POO.desafioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario;
        funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f %n", funcionario.name, funcionario.netSalary());

        System.out.println("Which percentage to increase salary? ");
        funcionario.increaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f %n", funcionario.name, funcionario.netSalary());

        sc.close();
    }
}
