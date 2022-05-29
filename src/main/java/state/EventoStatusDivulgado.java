package state;

public class EventoStatusDivulgado implements EventoStatus {

    private EventoStatusDivulgado() {};
    private static EventoStatusDivulgado instance = new EventoStatusDivulgado();
    public static EventoStatusDivulgado getInstance() {
        return instance;
    }
    
    public String getStatus() {
        return "Divulgado";
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
        return "Divulgacao não realizada";
    }

    public String orcar(Evento evento) {
        return "Orcamento não realizado";
    }

}
