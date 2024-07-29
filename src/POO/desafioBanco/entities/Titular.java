package POO.desafioBanco.entities;

public class Titular {
    private String nome;

    public Titular(String primeiroNome, String sobrenome) {
        this.nome = primeiroNome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }
}
