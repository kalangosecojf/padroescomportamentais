package visitor;

public class Dj implements Musico {

    private int codigo;
    private String nome;
    private Evento evento;

    public Dj(int codigo, String nome, Evento evento) {
        this.codigo = codigo;
        this.nome = nome;
        this.evento = evento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeEvento() {
        return this.evento.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDj(this);
    }

}
