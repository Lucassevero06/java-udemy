package ArrayEListas;

public class ForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Alex", "Bob"};

        // leitura: "para cada String 'nome' dentro do array 'vect', faça..."
        for (String nome : vect) { // usando foreach para percorrer o array
            System.out.println(nome); // e imprimindo o nome
        }

        /*
        * FOREACH
        *
        *   -sintaxe opcional
        *   -pode ser usada em vetores e listas
        *    sintaxe:
        *       for (Tipo apelido : colecao) {
        *           comandos...
        *       }
        * */
    }
}
