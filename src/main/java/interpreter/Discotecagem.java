package interpreter;

public class Discotecagem {
    private double valorBase;
    private double quantidadeHoras;

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double calcularOrcamento() {
        return Orcamento.calcularOrcamento(this.valorBase, this.quantidadeHoras);
    }

    public double calcularImposto() {
        return Orcamento.calcularImposto(this.valorBase, this.quantidadeHoras);
    }
}
