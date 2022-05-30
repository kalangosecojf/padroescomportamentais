package command;

public class Evento {

    private String data;
    private int evento;
    private String situacao;

    public Evento(String data, int evento) {
        this.data = data;
        this.evento = evento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void iniciarEvento() {
        this.situacao = "Evento Iniciado";
    }

    public void terminarEvento() {
        this.situacao = "Evento Terminado";
    }
}
