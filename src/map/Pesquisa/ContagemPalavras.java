package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }
    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }
    public String encontrarPalavraMaisFrequente(){
        Integer maiorRepeticao = 0;
        String maiorQuantPalavras = null;
        for(Map.Entry<String,Integer> cont: palavrasMap.entrySet()){
            if(cont.getValue() >= maiorRepeticao){
                maiorRepeticao = cont.getValue();
                maiorQuantPalavras = cont.getKey();
            }
        }
        return maiorQuantPalavras;


    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("vasco", 15);
        contagem.adicionarPalavra("vco", 132);
        contagem.adicionarPalavra("andei", 32);
        System.out.println(contagem.encontrarPalavraMaisFrequente());
        contagem.exibirContagemPalavras();
        contagem.removerPalavra("vco");
        contagem.exibirContagemPalavras();

    }
}
