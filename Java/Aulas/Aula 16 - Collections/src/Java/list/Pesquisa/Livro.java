package Java.list.Pesquisa;

public class Livro {

    private String Titulo;
    private String Autor;
    private Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        Titulo = titulo;
        Autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Titulo='" + Titulo +
                ", Autor='" + Autor +
                ", Ano de Publicação=" + anoPublicacao
                ;
    }
}
