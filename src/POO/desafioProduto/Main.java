package POO.desafioProduto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do seu produto: ");
        Produto produto;
        produto = new Produto();
        produto.nome = sc.nextLine();

        System.out.println("digite o preco do seu produto: ");
        produto.preco = sc.nextDouble();

        System.out.println("digite a quantidade desse produto no estoque: ");
        produto.estoque = sc.nextInt();

        System.out.println("nome do produto: " + produto.nome);
        System.out.println("preco do produto: " + produto.preco);
        System.out.println("estoque do produto: " + produto.estoque);

        System.out.println("valor total no estoque: " + String.format("%.2f",produto.totalValueInStock()));

        System.out.println("digite a quantidade que deseja adicionar no estoque: ");
        int qtd = sc.nextInt();
        produto.addProducts(qtd);

        System.out.println("A quantidade no estoque é: " + produto.estoque);
        System.out.println("valor total no estoque: " + String.format("%.2f",produto.totalValueInStock()));

        System.out.println("digite a quantidade que deseja remover do estoque: ");
        int qtd2 = sc.nextInt();
        produto.removeProducts(qtd2);

        System.out.println("A quantidade no estoque é: " + produto.estoque);
        System.out.println("valor total no estoque: " + String.format("%.2f",produto.totalValueInStock()));

        sc.close();

    }
}
