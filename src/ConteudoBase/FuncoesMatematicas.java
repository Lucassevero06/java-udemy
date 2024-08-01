public class FuncoesMatematicas {
    public static void main(String[] args) {

        double x = 2;
        double y = 5;
        double A, B, C;

        // Math.sqrt(x) = raiz quadrada de x
        // Math.pow(x, y) = x elevado a y
        // Math.cbrt(x) = raiz cubica de x
        A = Math.sqrt(x); // variavel A recebe a raiz quadrada de x
        B = Math.pow(x, y); // variavel B recebe o resultado de x elevado a y
        C = Math.cbrt(x); // variavel C recebe o valor absoluto de x

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
}
