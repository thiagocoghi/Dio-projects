package Java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;
    //cria uma lista de pessoas
    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();

    }

    //adiciona pessoas a lista
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
      List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
      }

      public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
      }




public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
    ordenacaoPessoas.adicionarPessoa("nome 1", 25, 1.58);
    ordenacaoPessoas.adicionarPessoa("nome 2", 12, 1.35);
    ordenacaoPessoas.adicionarPessoa("nome 3", 18, 1.75);
    ordenacaoPessoas.adicionarPessoa("nome 4", 41, 1.23);
    ordenacaoPessoas.adicionarPessoa("nome 5", 35, 1.85);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
}
}



