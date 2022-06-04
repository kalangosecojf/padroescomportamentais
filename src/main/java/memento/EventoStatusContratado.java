package memento;

import state.Evento;

public class EventoStatusContratado implements EventoStatus {

    private EventoStatusContratado() {};
    private static EventoStatusContratado instance = new EventoStatusContratado();
    public static EventoStatusContratado getInstance() {
        return instance;
    }

    public String getNomeStatus() {
        return "Contratado";
    }

}
