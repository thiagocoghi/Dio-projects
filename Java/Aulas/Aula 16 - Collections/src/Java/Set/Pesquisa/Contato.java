package Java.Set.Pesquisa;

public class Contato {

    private String nome;
    private int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return numero;
    }

    public void setTelefone(Integer telefone) {
        this.numero = telefone;
    }

    public Contato(String nome, Integer telefone) {
        this.nome = nome;
        this.numero = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + numero +
                '}';
    }
}
