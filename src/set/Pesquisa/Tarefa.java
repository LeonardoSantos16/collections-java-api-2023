package set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean pendente;

    public Tarefa(String descricao, boolean aaaa) {
        this.descricao = descricao;
        this.pendente = aaaa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", aaaa=" + pendente +
                '}';
    }


    public boolean isPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }

    public String getDescricao() {
        return descricao;
    }


}
