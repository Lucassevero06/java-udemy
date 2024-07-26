package POO.desafioProduto;

public class Produto {

    public String nome;
    public double preco;
    public int estoque;

    public double totalValueInStock() {
        return preco * estoque;
    }

    public void addProducts(int quantity) {
        estoque += quantity;
    }

    public void removeProducts(int quantity) {
        estoque -= quantity;
    }

}
