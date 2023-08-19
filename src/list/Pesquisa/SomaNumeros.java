package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for(int n : numeros){
            soma += n;
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for(int n : numeros){
            if(n > maiorNumero){
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = numeros.get(0);
        for(int d : numeros){

            if(d < menorNumero){
                menorNumero = d;
            }
        }
        return menorNumero;
    }

    @Override
    public String toString() {
        return "numeros=" + numeros;
    }

    public static void main(String[] args) {
        SomaNumeros inteiro = new SomaNumeros();
        inteiro.adicionarNumero(11);
        inteiro.adicionarNumero(22);
        inteiro.adicionarNumero(33);
        System.out.println(inteiro.calcularSoma());
        System.out.println(inteiro.encontrarMaiorNumero());
        System.out.println(inteiro.encontrarMenorNumero());
        System.out.println(inteiro);
    }
}
