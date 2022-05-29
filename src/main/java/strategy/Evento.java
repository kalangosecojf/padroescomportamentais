package strategy;

public class Evento {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void calcularDespesaBruta(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new DespesaBruta());
    }

    public void calcularDespesaIss(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new DespesaIss());
    }

    public void calcularDespesaIcms(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new DespesaIcms());
    }

    public void calcularDespesaEcad(float valor1, float valor2) {
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.valor = calculadora.calcular(new DespesaEcad());
    }

}
