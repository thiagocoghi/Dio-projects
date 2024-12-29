package Java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String Nome;
    private int Idade;
    private double  Altura;

    public Pessoa(String nome, int idade, double altura) {
        Nome = nome;
        Idade = idade;
        Altura = altura;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public double getAltura() {
        return Altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", Altura=" + Altura +
                '}';
    }


    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(Idade, p.getIdade());
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
