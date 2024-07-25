public class FuncoesParaString {
    public static void main(String[] args) {

        // checklist
        /*
        * Formatar:
        *   toLowerCase()
        *   toUpperCase()
        *   trim()
        *
        * Recortar:
        *   substring(inicio)
        *   substring(inicio, fim)
        *
        * Substituir:
        *   replace(char, char)
        *   replace(String, String)
        *
        * Buscar:
        *   indexOf(char)
        *   indexOf(String)
        *   lastIndexOf(char)
        *   lastIndexOf(String)
        *
        * str.Split("")
        *
        * */

        String original = "abcde FGHIJ ABC abc DEFG";

        String s1 = original.toLowerCase(); // deixa toda em minuscula
        String s2 = original.toUpperCase(); // deixa toda em maiuscula
        String s3 = original.trim(); // matem a string original e elimina os espacos em branco
        String s4 = original.substring(2); // pega a partir do indice 2
        String s5 = original.substring(2, 9); // pega a partir do indice 2 e vai ate o indice 9
        String s6 = original.replace('a', 'x'); // troca a por x
        String s7 = original.replace("Lucas", "Pedro"); // troca o Lucas por Pedro
        int i = original.indexOf("bc"); // retorna o indice da primeira ocorrencia
        int j = original.lastIndexOf("bc"); // retorna o indice da ultima ocorrencia

        String s = "lucas gabriel severo";
        String[] palavras = s.split(" "); // divide a string em palavras

        String word1= palavras[0];
        String word2= palavras[1];
        String word3= palavras[2];

        System.out.println(original);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(i);
        System.out.println(j);

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }
}
