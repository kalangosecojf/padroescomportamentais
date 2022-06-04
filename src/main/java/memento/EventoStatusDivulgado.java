package memento;

import state.Evento;

public class EventoStatusDivulgado implements EventoStatus {

    private EventoStatusDivulgado() {};
    private static EventoStatusDivulgado instance = new EventoStatusDivulgado();
    public static EventoStatusDivulgado getInstance() {
        return instance;
    }
    
    public String getNomeStatus() {
        return "Divulgado";
    }

}
