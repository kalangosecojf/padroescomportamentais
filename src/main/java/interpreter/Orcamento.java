package interpreter;

public class Orcamento {

    public static String formulaOrcamento = "valorBase * quantidadeHoras";

    public static String formulaImposto = "valorBase * quantidadeHoras * 0.25";

    public static double calcularOrcamento(double valorBase, double quantidadeHoras) {
        String expressao;
        expressao = formulaOrcamento.replace("valorBase", Double.toString(valorBase));
        expressao = expressao.replace("quantidadeHoras", Double.toString(quantidadeHoras));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

    public static double calcularImposto(double valorBase, double quantidadeHoras) {
        String expressao;
        expressao = formulaImposto.replace("valorBase", Double.toString(valorBase));
        expressao = expressao.replace("quantidadeHoras", Double.toString(quantidadeHoras));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

}
