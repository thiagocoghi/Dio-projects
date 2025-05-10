package Java.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, Integer codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(Integer codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public String exibirConvidados(){
        return convidadoSet.toString();
    }




    public static void main(String[] args) {


        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();


        conjuntoConvidados.adicionarConvidado("Maria", 1238);
        conjuntoConvidados.adicionarConvidado("João", 1111);
        conjuntoConvidados.adicionarConvidado("Mario", 10);
        conjuntoConvidados.adicionarConvidado("Tonho", 2560);
        conjuntoConvidados.adicionarConvidado("Camilo", 999);
        conjuntoConvidados.adicionarConvidado("Jorge", 843);
        conjuntoConvidados.adicionarConvidado("Jackson", 3985);
        conjuntoConvidados.adicionarConvidado("Romildo", 1563);
        conjuntoConvidados.adicionarConvidado("Carlos", 8796);
        conjuntoConvidados.adicionarConvidado("Camilo", 10);

        System.out.println("Há " + conjuntoConvidados.contarConvidados() + " convidados na lista");
        System.out.println(conjuntoConvidados.exibirConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1563);
        System.out.println("Há " + conjuntoConvidados.contarConvidados() + " convidados na lista");
        System.out.println(conjuntoConvidados.exibirConvidados());
    }



}
