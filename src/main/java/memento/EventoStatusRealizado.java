package memento;

import state.Evento;

public class EventoStatusRealizado implements EventoStatus {

    private EventoStatusRealizado() {};
    private static EventoStatusRealizado instance = new EventoStatusRealizado();
    public static EventoStatusRealizado getInstance() {
        return instance;
    }

    public String getNomeStatus() {
        return "Realizado";
    }

}
