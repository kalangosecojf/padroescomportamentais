package state;

public class Evento {
    
    private String nome;
    private EventoStatus status;

    public Evento() {
        this.status = EventoStatusContratado.getInstance();
    }
    
    public void setStatus(EventoStatus status) {
        this.status = status;
    }
    

    public String contratar() { return status.contratar(this);}

    public String realizar() { return status.realizar(this);}

    public String cancelar() { return status.cancelar(this);}

    public String divulgar() { return status.divulgar(this);}

    public String orcar() { return status.orcar(this);}


    public String getNomeStatus() {
        return status.getStatus();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EventoStatus getStatus() {
        return status;
    }    
}
