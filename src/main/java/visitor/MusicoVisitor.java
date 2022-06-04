package visitor;

public class MusicoVisitor implements Visitor {

    public String exibir(Musico musico) {
        return musico.aceitar(this);
    }

    @Override
    public String exibirDj(Dj dj) {
        return "DJ{" +
                "codigo=" + dj.getCodigo() +
                ", nome='" + dj.getNome() + '\'' +
                ", evento=" + dj.getNomeEvento() +
                '}';
    }

    @Override
    public String exibirZabumbeiro(Zabumbeiro zabumbeiro) {
        return "Zabumbeiro{" +
                "codigo=" + zabumbeiro.getCodigo() +
                ", nome='" + zabumbeiro.getNome() + '\'' +
                ", instrumento='" + zabumbeiro.getInstrumento() + '\'' +
                '}';
    }

    @Override
    public String exibirSanfoneiro(Sanfoneiro sanfoneiro) {
        return "Sanfoneiro{" +
                "codigo=" + sanfoneiro.getCodigo() +
                ", nome='" + sanfoneiro.getNome() + '\'' +
                ", salario=" + sanfoneiro.getSalario() +
                '}';
    }
}
