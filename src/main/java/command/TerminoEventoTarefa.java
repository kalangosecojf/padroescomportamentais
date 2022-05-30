package command;

public class TerminoEventoTarefa implements Tarefa {

    private Evento evento;

    public TerminoEventoTarefa(Evento evento) {
        this.evento = evento;
    }

    public void iniciar() {
        this.evento.terminarEvento();
    }

    public void terminar() {
        this.evento.iniciarEvento();
    }
}
