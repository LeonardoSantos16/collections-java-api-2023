package list.OperacoesBasicas;

public class Item {
    private String nome;
    private int preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public Item(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }



    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
