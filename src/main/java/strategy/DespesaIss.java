package strategy;

public class DespesaIss implements Despesa {

    public float calcular(float valor1, float valor2) {
        if (valor1 == 0 || valor2 ==0) {
            throw new IllegalArgumentException("Divisão por zero");
        }
        else {
            return (valor1 * valor2)/0.05f;
        }
    }
}
