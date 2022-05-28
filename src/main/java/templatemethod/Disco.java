package templatemethod;

public abstract class Disco {

    private int matriculaDisco;
    protected String nomeDisco;
    private float vendas1Semestre;
    private float vendas2Semestre;

    public int getMatriculaDisco() {
        return matriculaDisco;
    }

    public void setMatriculaDisco(int matriculaDisco) {
        this.matriculaDisco = matriculaDisco;
    }

    public String getNomeDisco() {
        return nomeDisco;
    }

    public void setNomeDisco(String nomeDisco) {
        this.nomeDisco = nomeDisco;
    }

    public float getVendas1Semestre() {
        return vendas1Semestre;
    }

    public void setVendas1Semestre(float vendas1Semestre) {
        this.vendas1Semestre = vendas1Semestre;
    }

    public float getVendas2Semestre() {
        return vendas2Semestre;
    }

    public void setVendas2Semestre(float vendas2Semestre) {
        this.vendas2Semestre = vendas2Semestre;
    }

    public float calcularClassificacaoDisco() {
        return (this.vendas1Semestre * this.vendas2Semestre) / 100;
    }

    public abstract String verificarClassificacao();

    public String getTipoDisco() {
        return "DiscoOuro";
    }

    public String getInfo() {
        return getTipoDisco() + "{" +
                "matriculaDisco=" + this.matriculaDisco +
                ", nomeDisco='" + this.nomeDisco + '\'' +
                ", classificacao=" + this.verificarClassificacao() +
                '}';
    }
}
