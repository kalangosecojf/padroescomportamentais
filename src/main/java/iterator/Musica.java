package iterator;

public class Musica {

    private String nome;
    private boolean executada;

    public Musica(String nome, boolean executada) {
        this.nome = nome;
        this.executada = executada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isExecutada() {
        return executada;
    }

    public void setExecutada(boolean executada) {
        this.executada = executada;
    }
}
