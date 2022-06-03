package mediator;

public interface Producao {
    String receberPedidodeMusica(String mensagem);

    String receberDoacao(String mensagem);


    String receberReclamacaoMusica(String mensagem);
}
