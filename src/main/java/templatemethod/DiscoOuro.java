package templatemethod;

public class DiscoOuro extends Disco {

    public String verificarClassificacao() {
        if (this.calcularClassificacaoDisco() >= 100.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
