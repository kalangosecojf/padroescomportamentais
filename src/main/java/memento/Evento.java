package memento;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private EventoStatus status;
    private List<EventoStatus> memento = new ArrayList<EventoStatus>();

    public EventoStatus getStatus() {
        return this.status;
    }

    public void setStatus(EventoStatus status) {
        this.status = status;
        this.memento.add(this.status);
    }

    public void restauraStatus(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.status = this.memento.get(indice);
    }

    public List<EventoStatus> getListaStatus() {
        return this.memento;
    }
}
