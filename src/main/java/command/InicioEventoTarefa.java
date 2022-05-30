package command;

public class InicioEventoTarefa implements Tarefa {

    private Evento evento;

    public InicioEventoTarefa(Evento evento) {
        this.evento = evento;
    }

    public void iniciar() {
        this.evento.iniciarEvento();
    }

    public void terminar() {
        this.evento.terminarEvento();
    }
}
