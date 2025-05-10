package Java.Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private Integer codigoConvite;

    public Convidado(String nome, Integer codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(Integer codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return nome + " Convite = " + codigoConvite + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return Objects.equals(codigoConvite, convidado.codigoConvite);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }
}






