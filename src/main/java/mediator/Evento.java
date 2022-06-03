package mediator;

public class Evento implements Producao {

    private static Evento instancia = new Evento();

    private Evento() {}

    public static Evento getInstancia() {
        return instancia;
    }

    public String receberPedidodeMusica(String mensagem) {
        return "A Producao agradece a mensagem: " + mensagem;
    }



    public String receberDoacao(String mensagem) {
        return "A Producao agradece a doação: " + mensagem;
    }

    public String receberReclamacaoMusica(String mensagem) {
        return "A Producao vai tratar da reclamação: " + mensagem;
    }
}
