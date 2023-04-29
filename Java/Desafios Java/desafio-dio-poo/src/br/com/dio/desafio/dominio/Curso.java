package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    @Override
    public double calularXP() {
        return XP_PADRAO + 20.0;
    }
    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso " +
                "titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria +
                " horas \n"
                ;
    }
}
