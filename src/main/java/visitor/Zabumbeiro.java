package visitor;

public class Zabumbeiro implements Musico {

    private int codigo;
    private String nome;
    private String instrumento;

    public Zabumbeiro(int codigo, String nome, String instrumento) {
        this.codigo = codigo;
        this.nome = nome;
        this.instrumento = instrumento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirZabumbeiro(this);
    }

}
