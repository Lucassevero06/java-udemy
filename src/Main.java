import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
        String nome = "Lucas";
        int idade = 18;
        double renda = 1400;
//
//        System.out.println("Olá " + nome);
//
//        System.out.println("Você tem " + idade + " anos");
//
//        String sexo = "Masculino";
//        System.out.println("Sexo: " + sexo);

//        if (idade > 18) {
//            System.out.println("É maior que 18");
//        } else if (idade == 18) {
//            System.out.println("Tem 18 anos");
//        } else {
//            System.out.println("Não é de maior");
//        }


        // uma forma de formatar o numero real, para que ele exiba apenas 1 numeros apos o ponto flutuante
        // porém ele ainda mantém o ponto flutuante de acordo com a região em que a sua maquina está configurada
        // Exemplo: se for pt-br o ponto flutuante será uma virgula(,), se for en-us o ponto flutuante é um ponto(.)

        double x = 12.7899;
        double y = 12.7899;

//        // aqui é exibido com ,
//        System.out.printf("%.1f%n", x);
//        System.out.printf("%.2f%n", y);

        Locale.setDefault(Locale.US); //é uma classe que precisa ser importada

        // aqui é exibido com o .
        System.out.printf("%.1f%n", x);
        System.out.printf("%.2f%n", y);

        System.out.printf("RESULTADO = %.1f metros%n", x);

        // para concatenar vparios elementos em um mesmo comando de escrita, é preciso usar:
        // %s para valor em string(texto);
        // %d para valor em int(inteiro);
        // %.2f para valor em double(real);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}