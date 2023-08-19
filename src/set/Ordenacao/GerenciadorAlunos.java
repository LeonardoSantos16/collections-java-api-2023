package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Double matricula, int nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }
    public void removerAluno(Double matricula){
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno c : alunoSet) {
                if (c.getMatricula().equals(matricula)) {
                    alunoParaRemover = c;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> setOrdenadaNome = new TreeSet<>(alunoSet);
        setOrdenadaNome.addAll(alunoSet);
        return setOrdenadaNome;
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> setOrdenadaNota = new TreeSet<>(new ComparatorPorNota());
        setOrdenadaNota.addAll(alunoSet);
        return  setOrdenadaNota;
    }
    public void exibiAlunos(){
        System.out.println(alunoSet.toString());
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();
        alunos.adicionarAluno("vasco",14.2,9);
        alunos.adicionarAluno("vaaasco",15.2,3);
        alunos.adicionarAluno("leo",12.2,10);
        alunos.adicionarAluno("abel",23.5,7);
        alunos.exibiAlunos();
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());
        alunos.removerAluno(15.2);
        alunos.exibiAlunos();
    }
}
