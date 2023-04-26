import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> sensuEstados = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};
        System.out.println(sensuEstados);

        //modificando o numero de habitantes do RN
        sensuEstados.put("RN", 3534165);
        System.out.println(sensuEstados);

        //confira se o estado PB está no dicionário, caso não esteja adicione-o
        if (sensuEstados.containsValue("PB") == false) sensuEstados.put("PB", 4039277);
        System.out.println("Acidionando estado da Paraiba");
        System.out.println(sensuEstados);

        //exibir a população do PE
        System.out.println("A população do estado do Pernambuco é de " + sensuEstados.get("PE"));


        //EXIBIR AS INFORMAÇÕES NA ORDEM EM QUE FORAM ADICIONADAS
        Map<String, Integer> sensuEstados1 = new LinkedHashMap<>() {{
             put("PE", 9616621);
             put("AL", 3351543);
             put("CE", 9187103);
             put("RN", 3534265);

         }};
         System.out.println(sensuEstados1.toString());
         Map<String, Integer> sensuEstados2 = new TreeMap<>(sensuEstados);
         System.out.println("--\tExibição em Ordem Alfabética\t--");
         System.out.println(sensuEstados2.toString());

         //Exibir o estado com a menor população
        Integer estadoMenosPopuloso = Collections.min(sensuEstados.values());
        Set<Map.Entry<String, Integer>> entries = sensuEstados.entrySet();
        String menorPopulacao = "";
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue().equals(estadoMenosPopuloso) ){
                menorPopulacao=entry.getKey();
            }
        }
        System.out.println("--\tO estado menos populoso é o "+ menorPopulacao +" com a população de "+ estadoMenosPopuloso +"\t--");

        //mostrar o estado com a maior população

        Integer estadoMaisPopuloso = Collections.max(sensuEstados.values());
        Set<Map.Entry<String, Integer>> entries1 = sensuEstados.entrySet();
        String maiorPopulacao = "";
        for(Map.Entry<String, Integer> entry1: entries){
            if(entry1.getValue().equals(estadoMaisPopuloso) ){
                maiorPopulacao=entry1.getKey();
            }
        }
        System.out.println("--\tO estado mais populoso é o "+ maiorPopulacao +" com a população de "+ estadoMaisPopuloso +"\t--");

        //mostrar a soma de todos os estados
        Iterator<Integer> iterator = sensuEstados.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("--\t A soma de toda a população é de - " + soma + "\t--");
        System.out.println("--\t A média de toda a população é de - " + soma/sensuEstados.size() + "\t--");

        //remover os estados com a população inferior a 4milhoes

        Iterator<Integer> iterator1 = sensuEstados.values().iterator();
        Integer corte = 4000000;
        System.out.println("--\t Os estados que possuem população superior á 4 milhoes são:");
        while (iterator1.hasNext()) {
            if (iterator1.next() < corte) {
                iterator1.remove();

            }
        }
            System.out.println("--\t"+sensuEstados.toString());
        sensuEstados.clear();
        System.out.println("--\t A biblioteca está vazia?\n Status: "+ sensuEstados.isEmpty());





    }

}

/*class Populacao {

    private Integer habitantes;

    public Populacao(Integer habitantes) {
        this.habitantes = habitantes;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main.Populacao populacao = (Main.Populacao) o;
        return Objects.equals(habitantes, populacao.habitantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitantes);
    }

    @Override
    public String toString() {
        return " " + habitantes;

    }
}*/

