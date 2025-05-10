package Java.Set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;


public class ConjuntoPalavrasUnicas {

    //class que define as configurações do objeto palavra e verifica se é única
//    public class PalavrasUnicas{
//
//        private String palavra;
//
//        public PalavrasUnicas(String palavra) {
//            this.palavra = palavra;
//        }
//
//        public String getPalavra() {
//            return palavra;
//        }
//
//        public void setPalavra(String palavra) {
//            this.palavra = palavra;
//        }
//
//
//                @Override
//        public boolean equals(Object o) {
//            if (o == null || getClass() != o.getClass()) return false;
//            PalavrasUnicas that = (PalavrasUnicas) o;
//            return Objects.equals(palavra, that.palavra);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hashCode(palavra);
//        }
//    }


    //inicia o Set
    private Set<String> palavrasUnicasSet;

    //cria Set ConjuntoPalavrasUnicas
    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()){
             if(palavrasUnicasSet.contains(palavra)){
                   palavrasUnicasSet.remove(palavra);
                }
        }else {
            System.out.println("Não há nada para remover!");
        }

    }

    public void exibirPalavrasUniscas(){
        System.out.println(palavrasUnicasSet);
    }

    public void verificarPalavra(String palavra) {

            if (palavrasUnicasSet.contains(palavra)) {
                System.out.println("A palavra " + palavra + " é Repetida");

           }else {
            System.out.println("A palavra " + palavra + " não é repetida");
        }

    }

    public int contarPalavras(){
        return palavrasUnicasSet.size();
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("marmita");
        conjuntoPalavrasUnicas.adicionarPalavra("tampa");
        conjuntoPalavrasUnicas.adicionarPalavra("Termopar");
        conjuntoPalavrasUnicas.adicionarPalavra("biga");
        conjuntoPalavrasUnicas.adicionarPalavra("maratona");
        conjuntoPalavrasUnicas.adicionarPalavra("hino");
        System.out.println("há "+ conjuntoPalavrasUnicas.contarPalavras() + " palavras no conjunto \n");
        conjuntoPalavrasUnicas.exibirPalavrasUniscas();

        conjuntoPalavrasUnicas.verificarPalavra("biga");
        conjuntoPalavrasUnicas.verificarPalavra("Manta");

        conjuntoPalavrasUnicas.removerPalavra("tampa");
        System.out.println("há "+ conjuntoPalavrasUnicas.contarPalavras() + " palavras no conjunto \n");
        conjuntoPalavrasUnicas.exibirPalavrasUniscas();

    }


}
