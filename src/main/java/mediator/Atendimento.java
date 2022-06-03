package mediator;

public class Atendimento {

    private static Atendimento instancia = new Atendimento();

    private Atendimento() {}

    public static Atendimento getInstancia() {
        return instancia;
    }

    public String receberPedidodeMusica(String mensagem) {
        return "O Evento agradece seu pedido.\n"+
                "A Producao respondeu seu pedido.\n" +
                ">>" + Evento.getInstancia().receberPedidodeMusica(mensagem);
    }

    public String receberDoacao(String mensagem) {
        return "O Evento agradece seu contato.\n"+
                "A Producao respondeu sua doação.\n" +
                ">>" + Evento.getInstancia().receberDoacao(mensagem);
    }

    public String receberReclamacaoMusica(String mensagem) {
        return "O Evento agradece seu contato.\n"+
                "A Producao respondeu sua reclamação.\n" +
                ">>" + Evento.getInstancia().receberReclamacaoMusica(mensagem);
    }

}
