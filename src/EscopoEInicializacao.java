public class EscopoEInicializacao {
    public static void main(String[] args) {

        //a variavel precisa ser declarada com um valor incial para que ela possa ser usada, senão o codigo não compila
        double price = 400.00;

        double desconto;

        if (price < 200.00) {
            // a variavel desconto pode ser usada dentro do bloco if
            desconto = price * 0.1;
        } else {
            desconto = 0;
        }

        System.out.println(price);

        // não podendo ser usada fora do if
        System.out.println(desconto);
    }
}
