package Java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double precoTotal() {
        Double valorTotal = 0d;
        for (Item i : itemList) {
            Double soma = i.getPreco() * i.getQuantidade();
            valorTotal += soma;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {

            CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

            // Adicionando itens ao carrinho
            carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
            carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
            carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
            carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

            // Exibindo os itens no carrinho
            carrinhoDeCompras.exibirItens();

            // Removendo um item do carrinho
            carrinhoDeCompras.removerItem("Lápis");

            // Exibindo os itens atualizados no carrinho
            carrinhoDeCompras.exibirItens();

            // Calculando e exibindo o valor total da compra
           System.out.println("O valor total da compra é = " + carrinhoDeCompras.precoTotal() );
        }
    }
