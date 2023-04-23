import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);


//        numerosAleatorios.stream()
//                 .forEach(System.out::println);
//        numerosAleatorios.forEach(System.out::println);

        /*System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("--\tTansforme esta lista de String em uma lista de números inteiros.");
        List<Integer> collectlist = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList();
        //.forEach (System.out::println);
        System.out.println(collectlist);*/


        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //.forEach(System.out::println);


        /*System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> collectListPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                }).collect(Collectors.toList());
                System.out.println(collectListPares);*/


/*        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);*/

//        System.out.println("Remova os valores ímpares: ");
//        numerosAleatorios1.removeIf(integer -> integer % 2 != 0);
//        System.out.println(numerosAleatorios1);
//        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
//        System.out.println(numerosAleatoriosInteger);

//        Para você
        System.out.println("--\t Remova os numeros Impares: ");
        numerosAleatoriosInteger.removeIf(i -> i %2 !=0);
                System.out.println(numerosAleatoriosInteger);

                        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatorios.stream()
                        .mapToInt(Integer::parseInt)
                        .min()
                        .ifPresent(System.out::println);


        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatorios.stream()
                        .mapToInt(Integer::parseInt)
                        .max()
                                .ifPresent(System.out::println);


        System.out.println("Pegue apenas os números pares e some: " );
        int somaDosPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n%2 == 0)
                .reduce(0,Integer::sum);
        System.out.println(somaDosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<String> numerosOrdenados = numerosAleatorios.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.print(numerosOrdenados + "\n");


        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Integer, List<Integer>> numerosAgrupados = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .collect(Collectors.groupingBy(n -> n));
        System.out.println(numerosAgrupados);
//        dica: collect(Collectors.groupingBy(new Function())

    }
}