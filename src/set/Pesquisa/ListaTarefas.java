package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    public Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefaSet.add(tarefa);
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        for(Tarefa task : tarefaSet){
            if(task.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = task;
            }
        }
        tarefaSet.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet.toString());
    }
    public void contarTarefas(){
        System.out.println(tarefaSet.size());
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa task : tarefaSet){
            if(task.isPendente()){
                tarefasConcluidas.add(task);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa task : tarefaSet){
            if(!task.isPendente()){
                tarefasPendentes.add(task);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa task : tarefaSet){
            if(task.getDescricao().equalsIgnoreCase(descricao)){
                task.setPendente(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa task : tarefaSet){
            if(task.getDescricao().equalsIgnoreCase(descricao)){
                task.setPendente(false);
            }
        }
    }
    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas tarefa = new ListaTarefas();
        tarefa.adicionarTarefa(new Tarefa("teste",false));
        tarefa.adicionarTarefa(new Tarefa("analise", true));
        tarefa.adicionarTarefa(new Tarefa("adm", false));
        tarefa.adicionarTarefa(new Tarefa("conteudo", true));
        tarefa.contarTarefas();
        tarefa.exibirTarefas();
        tarefa.marcarTarefaConcluida("adm");
        tarefa.marcarTarefaPendente("analise");
        tarefa.removerTarefa("analise");
        System.out.println(tarefa.obterTarefasConcluidas());
        System.out.println(tarefa.obterTarefasPendentes());
        tarefa.exibirTarefas();
        tarefa.limparListaTarefas();
        tarefa.exibirTarefas();

    }
}
