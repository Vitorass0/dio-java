package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover=  new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTarefas(){
        return tarefaList.size();
    }

    public void exibirTarefas(){
        System.out.printf(tarefaList.toString());
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        System.out.println("O número de tarefas é: " + lista.obterNumeroTarefas());
        lista.adicionarTarefa("Tarefa 01");
        lista.adicionarTarefa("Tarefa 02");
        lista.adicionarTarefa("Tarefa 03");
        lista.removerTarefa("Tarefa 02");
        System.out.println("O número de tarefas é: " + lista.obterNumeroTarefas());
        lista.exibirTarefas();


    }
}
