package memento;

import state.Evento;

public class EventoStatusOrcado implements EventoStatus {

    private EventoStatusOrcado() {};
    private static EventoStatusOrcado instance = new EventoStatusOrcado();
    public static EventoStatusOrcado getInstance() {
        return instance;
    }
    
    public String getNomeStatus() {
        return "Orcado";
    }
    
}

