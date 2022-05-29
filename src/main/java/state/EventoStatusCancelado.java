package state;

public class EventoStatusCancelado implements EventoStatus {

    private EventoStatusCancelado() {};
    private static EventoStatusCancelado instance = new EventoStatusCancelado();
    public static EventoStatusCancelado getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Cancelado";
    }


    public String contratar(Evento evento) {
        return "Contrato não realizado";
    }

    public String realizar(Evento evento) {
        return "Evento não realizado";
    }

    public String cancelar(Evento evento) {
        return "Cancelamento não realizado";
    }

    public String divulgar(Evento evento) {
        return "Divulgacao não realizada";
    }

    public String orcar(Evento evento) {
        evento.setStatus(EventoStatusOrcado.getInstance());
        return "Orcamento realizado";
    }
}
