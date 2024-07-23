public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nome = "Lucas";
        System.out.println("Olá " + nome);

        int idade = 18;
        System.out.println("Você tem " + idade + " anos");

        String sexo = "Masculino";
        System.out.println("Sexo: " + sexo);

        if (idade > 18) {
            System.out.println("É maior que 18");
        } else if (idade == 18) {
            System.out.println("Tem 18 anos");
        } else {
            System.out.println("Não é de maior");
        }
    }
}