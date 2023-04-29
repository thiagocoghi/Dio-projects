// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        double compraValor = (livro1.getPreco()*livro1.getQuantidade())+(livro2.getQuantidade()*livro2.getPreco());
        int livrosComprados = livro1.getQuantidade()+livro2.getQuantidade();
        System.out.print("Valor total da compra: ");
        System.out.printf("%.2f",compraValor);
        System.out.println("\nNúmero de livros comprados: " + livrosComprados +
                "\nObrigado por comprar na nossa livraria!" );

    }
}

    class Livro {
        String nome;
        double preco;
        int quantidade;

        public Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }

