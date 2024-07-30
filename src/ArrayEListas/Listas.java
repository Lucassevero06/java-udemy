package ArrayEListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        // List é uma interface não pode ser instanciada, as classses ArrayList e LinkedList implementam ela
        // List x = new List();

        ArrayList<String> l = new ArrayList<>(); // <String> serve para informar que o tipo dos itens do array será string

        /*
        * Metodos do List:
        *   - size()
        *   - add(obj), add(int, obj)
        *   - remove(obj), remove(int)
        *   - get(int)
        *   - set(int, obj)
        *   - filter(Predicate)
        *   - indexOf(obj), lastIndexOf(obj)
        *   - clear()
        *   - contains(obj)
        *   - isEmpty()
        *   - sort(Comparator)
        * */

        List<String> list = new ArrayList<>();

        list.add("Lucas");
        list.add("Bob");
        list.add("Alex"); // adicionando itens no array
        list.add("Maria"); // os itens precisam ser do mesmo tipo que o array aceita nesse caso, String
        list.add("Anna");
        list.add(2, "Marco"); // inserindo itens no array na posicao especifica

        System.out.println(list.size()); // exibindo o tamanho do array (.length não funciona)

        for (String nome : list) { // pecorrendo o array
            System.out.println(nome); // exibindo nomes
        }

        System.out.println("------------------------------------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); // removendo itens do array que comecem com a letra M

        System.out.println(list.size()); // exibindo o tamanho do array (.length não funciona)

        for (String nome : list) { // pecorrendo o array
            System.out.println(nome); // exibindo nomes
        }
        System.out.println("--------------------------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("Index of marco: " + list.lastIndexOf("marco")); // quando ele não encontra o item, ele retorna -1

        System.out.println("--------------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
