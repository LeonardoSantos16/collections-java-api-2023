package set.OperacoesBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    public Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            palavrasUnicas.remove(palavra);
        }
    }
    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas.toString());
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("vasco");
        conjunto.adicionarPalavra("leo");
        conjunto.adicionarPalavra("teste");
        conjunto.adicionarPalavra("leo");
        conjunto.exibirPalavrasUnicas();
        System.out.println(conjunto.verificarPalavra("leo"));
        conjunto.removerPalavra("vasco");
        conjunto.exibirPalavrasUnicas();
    }
}
