package POO.desafioProduto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o name do seu product: ");
        String name = sc.nextLine();

        System.out.println("digite o price do seu product: ");
        double price = sc.nextDouble();

        // instanciando produto e atribuindo valores com construtor
        Product product = new Product(name, price);

        product.setName("Computer");
        product.setPrice(1200.00);

        System.out.println("name do product: " + product.getName());
        System.out.println("price do product: " + product.getPrice());
        System.out.println("quantity do product: " + product.getQuantity());

        System.out.println("valor total no quantity: " + String.format("%.2f",product.totalValueInStock()));

        System.out.println("digite a quantidade que deseja adicionar no quantity: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("A quantidade no quantity é: " + product.getQuantity());
        System.out.println("valor total no quantity: " + String.format("%.2f",product.totalValueInStock()));

        System.out.println("digite a quantidade que deseja remover do quantity: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("A quantidade no quantity é: " + product.getQuantity());
        System.out.println("valor total no quantity: " + String.format("%.2f",product.totalValueInStock()));

        sc.close();

    }
}
