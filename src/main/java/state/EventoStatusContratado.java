package state;

public class EventoStatusContratado implements EventoStatus {

    private EventoStatusContratado() {};
    private static EventoStatusContratado instance = new EventoStatusContratado();
    public static EventoStatusContratado getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Contratado";
    }
    
    public String contratar(Evento evento) {
        return "Contrato não realizado";

    }
    
    public String realizar(Evento evento) {
        evento.setStatus(EventoStatusRealizado.getInstance());
        return "Evento realizado";
    }
    
    public String cancelar(Evento evento) {
        evento.setStatus(EventoStatusCancelado.getInstance());
        return "Cancelamento realizado";
    }
    
    public String divulgar(Evento evento) {
        evento.setStatus(EventoStatusDivulgado.getInstance());
        return "Divulgacao realizada";
    }
    
    public String orcar(Evento evento) {
        return "Orcamento não realizado";
    }

}
