package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livraria;
    public LivrariaOnline(){
        this.livraria = new HashMap<>();
    }
    public void adicionarLivro(String isbn,Livro livro){
        livraria.put(isbn, livro);
    }
    public void removerLivro(String titulo){
        if(!livraria.isEmpty()){
            for(Map.Entry<String,Livro> livro : livraria.entrySet()){
                if(livro.getValue().getTitulo().equals(titulo)){
                    livraria.remove(livro.getKey());
                    break;
                }
            }
        }
    }
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return new TreeMap<>(livraria);
    }


    public Map.Entry<String, Livro> exibirLivroMaisBarato(){
        Map.Entry<String, Livro> livroMenor = null;
        double valorMenor = 9999;
        for(Map.Entry<String, Livro> entry : livraria.entrySet()){
            if(entry.getValue().getPreco() <= valorMenor){
                valorMenor = entry.getValue().getPreco();
                livroMenor = entry;
            }
        }
        return livroMenor;
    }

    public Map.Entry<String, Livro> obterLivroMaisCaro(){
        Map.Entry<String, Livro> livroMaior = null;
        double valorMaior = 0;
        for(Map.Entry<String, Livro> entry : livraria.entrySet()){
            if(entry.getValue().getPreco() >= valorMaior){
                valorMaior = entry.getValue().getPreco();
                livroMaior = entry;
            }
        }
        return livroMaior;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Set<Map.Entry<String, Livro>> setLivrosPorAutor = new TreeSet<>(new ComparatorPorAutor());
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getAutor().equals(autor)) {
                setLivrosPorAutor.add(entry);
            }
        }
        Map<String, Livro> LivrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : setLivrosPorAutor) {
            LivrosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return LivrosPorAutor;
    }

    public static void main(String[] args) {
        LivrariaOnline eminem = new LivrariaOnline();
        eminem.adicionarLivro("vasci",new Livro("adada", "eu", 12));
        eminem.adicionarLivro("leo",new Livro("lei", "carro", 40));
        eminem.adicionarLivro("leaaao",new Livro("lei", "carro", 80));
        eminem.adicionarLivro("marques",new Livro("teste", "moto", 29));
        System.out.println(eminem.pesquisarLivrosPorAutor("eu"));
        eminem.removerLivro("adada");
        System.out.println(eminem.exibirLivroMaisBarato());
        System.out.println(eminem.obterLivroMaisCaro());

        System.out.println(eminem.exibirLivrosOrdenadosPorPreco());

    }
}
