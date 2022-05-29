package state;

public class EventoStatusRealizado implements EventoStatus {

    private EventoStatusRealizado() {};
    private static EventoStatusRealizado instance = new EventoStatusRealizado();
    public static EventoStatusRealizado getInstance() {
        return instance;
    }

    public String getStatus() {
        return "Realizado";
    }

    public String contratar(Evento evento) {
        return "Contrato não realizado";
    }

    public String realizar(Evento evento) {
        return "Evento não realizado";
    }

    public String cancelar(Evento evento) {
        return "Cancelamento realizado";
    }

    public String divulgar(Evento evento) {
        return "Divulgacao não realizada";
    }

    public String orcar(Evento evento) {
        evento.setStatus(EventoStatusOrcado.getInstance());
        return "Orcamento realizado";
    }

}
