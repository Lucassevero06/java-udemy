package POO;

import java.util.Locale;
import java.util.Scanner;
import POO.Triangle;

public class DesafioPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // instanciando os objetos da classe Triangle
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("enter the measures the triangle X: ");
        // atribuindo valores aos atributos
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("enter the measures the triangle Y: ");
        // atribuindo valores aos atributos
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // chamando metodo para calcular a area dos triangulos
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f %n", areaX);
        System.out.printf("Triangle Y area: %.4f %n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
