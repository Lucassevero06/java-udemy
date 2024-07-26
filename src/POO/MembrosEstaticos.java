package POO;

import POO.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {

    public static void main(String[] args) {
        /*
        *
        * MEMBROS ESTATICOS:
        *   -também cahamdos membros de classe
        *      -em oposição a membros de instancia
        *
        *   -são membros que fazem sentido independente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do proprio nome da classe
        *
        *   -aplicações comuns:
        *       -Classes utilitárias
        *       -Declaração de constantes
        *
        *   -uma classe que possui membros estaticos, podem ser uma classe estatica também. esta classe não poderá ser instanciada
        *
        * */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("PI value: %.2f %n", calc.PI);

        sc.close();
    }
}
