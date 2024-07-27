package POO.desafioProduto;

public class Product {

    public String name;
    public double price;
    public int quantity;

    //constructor in java
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga
    public Product() {
    }

    //sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return  name
                + ", R$"
                + String.format("%.2f",price)
                + ", " + this.quantity
                + " unidades, Total: R$ "
                + String.format("%.2f",totalValueInStock());
    }

}
