package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }
    public void exibirPalavras(){
        System.out.println(dicionario);
    }
    public String pesquisarPorPalavra(String palavra){
        return dicionario.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario1 = new Dicionario();
        dicionario1.adicionarPalavra("vas", "corinthians");
        dicionario1.adicionarPalavra("leo", "carro");
        dicionario1.adicionarPalavra("ar", "terra");
        dicionario1.exibirPalavras();
        dicionario1.removerPalavra("leo");
        dicionario1.exibirPalavras();
        System.out.println(dicionario1.pesquisarPorPalavra("vas"));
    }
}
