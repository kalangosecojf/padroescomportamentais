package state;

public class EventoStatusOrcado implements EventoStatus {

    private EventoStatusOrcado() {};
    private static EventoStatusOrcado instance = new EventoStatusOrcado();
    public static EventoStatusOrcado getInstance() {
        return instance;
    }
    
    public String getStatus() {
        return "Orcado";
    }

    public String contratar(Evento evento) {
        evento.setStatus(EventoStatusContratado.getInstance());
        return "Contrato realizado";
    }

    public String realizar(Evento evento) {
        return "Evento não realizado";
    }

    public String cancelar(Evento evento) {
        evento.setStatus(EventoStatusCancelado.getInstance());
        return "Cancelamento realizado";
    }

    public String divulgar(Evento evento) {
        return "Divulgacao não realizada";
    }

    public String orcar(Evento evento) {
        return "Orcamento não realizado";
    }

}

