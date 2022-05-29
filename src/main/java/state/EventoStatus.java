package state;

public interface EventoStatus {
    
    String getStatus();

    String contratar(Evento evento);
    String realizar(Evento evento);

    String cancelar(Evento evento);

    String divulgar(Evento evento);

    String orcar(Evento evento);

}
