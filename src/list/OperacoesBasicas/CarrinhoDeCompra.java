package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    public List<Item> carrinho;

    public CarrinhoDeCompra() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, int preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removeItem = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removeItem.add(item);
            }
        }
        carrinho.removeAll(removeItem);
    }

    public double calcularValorTotal() {
        double valor = 0;
        for (Item item : carrinho) {
            valor += item.getPreco() * item.getQuantidade();
        }
        return valor;
    }

    public void ExibirItens() {
        System.out.println(carrinho.toString());
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarItem("leo",12,1);

        carrinho.adicionarItem("vasco",5,2);
        carrinho.ExibirItens();
        System.out.println(carrinho.calcularValorTotal());
        carrinho.removerItem("vasco");
        carrinho.ExibirItens();
    }
}
