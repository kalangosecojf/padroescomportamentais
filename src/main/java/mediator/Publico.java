package mediator;

public class Publico {

    public String pedirMusica(String mensagem) {
        return Atendimento.getInstancia().receberPedidodeMusica(mensagem);
    }

    public String receberDoacao(String mensagem) {
        return Atendimento.getInstancia().receberDoacao(mensagem);
    }



    public String reclamarMusica(String mensagem) {
        return Atendimento.getInstancia().receberReclamacaoMusica(mensagem);
    }


}
