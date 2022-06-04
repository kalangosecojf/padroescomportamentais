package memento;

import state.Evento;

public class EventoStatusCancelado implements EventoStatus {

    private EventoStatusCancelado() {};
    private static EventoStatusCancelado instance = new EventoStatusCancelado();
    public static EventoStatusCancelado getInstance() {
        return instance;
    }

    public String getNomeStatus() {
        return "Cancelado";
    }

}
