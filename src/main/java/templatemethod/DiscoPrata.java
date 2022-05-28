package templatemethod;

public class DiscoPrata extends Disco {

    public String verificarClassificacao() {
        if (this.calcularClassificacaoDisco() >= 50.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipoDisco() {
        return "DiscoPrata";
    }
}
