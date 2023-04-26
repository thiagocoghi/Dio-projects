import java.util.*;

public class Main {


    public static void main(String[] args) {
        /*class arcoIris{
            private String cor;

            public arcoIris(String cor) {
                this.cor = cor;
            }

            public String getCor() {
                return cor;
            }

            @Override
            public String toString() {
                return "{" +
                        "cor='" + cor + '\'' +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                arcoIris arcoIris = (arcoIris) o;
                return Objects.equals(cor, arcoIris.cor);
            }

            @Override
            public int hashCode() {
                return Objects.hash(cor);
            }
        }*/

        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        System.out.println(arcoIris);

        Iterator<String> iterator = arcoIris.iterator();

        //imprimir uma cor abaixo da outra
        int count = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // quantidade de cores do arco-iris
        System.out.println("O Arco-Iris tem " + arcoIris.size() + " cores");

        //exibir as cores em ordem alfabética
        System.out.println("Exbir as cores em ordem alfabética: ");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris2);

        //exibir as cores na ordem inversa da informada
        System.out.println("Exbir as cores em ordem inversa ");
        Set<String> arcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "verde", "amarelo", "laranja", "Vermelho")
        );
        System.out.println(arcoIris3);

        //exibir apenas as cores que comecem com a letra V
        System.out.println("Exbir as cores que se iniciam com V ");
        for (String cor : arcoIris) {
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }         }

        //remover as cores que não se iniciam com a letra V
        System.out.println("Remover as cores que não se iniciam com a letra V: ");
        Iterator<String> iterator1= arcoIris.iterator();
        while(iterator1.hasNext()) {
            if (!iterator1.next().startsWith("V")) {
                iterator1.remove();}
        }
        System.out.println(arcoIris);

        //limpar o conjunto
        arcoIris.clear();
        System.out.println(arcoIris);

        System.out.println("Conferindo se o conjunto está vazio: "+ arcoIris.isEmpty());
    }
}
