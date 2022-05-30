package command;

import java.util.ArrayList;
import java.util.List;

public class Discotecagem {

    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void executarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        tarefa.iniciar();
    }

    public void cancelarUltimaTarefa() {
        if (tarefas.size() != 0) {
            Tarefa tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.terminar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }

}
