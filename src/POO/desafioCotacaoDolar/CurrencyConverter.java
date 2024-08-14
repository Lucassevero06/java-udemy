package POO.desafioCotacaoDolar;

public class CurrencyConverter {
    public static double converter(double cotacao, double qtd) {
        double valorConvertido = cotacao * qtd;
        return valorConvertido * 1.06;
    }

}
