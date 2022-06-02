package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcamentoTest {

    @Test
    void deveCalcularOrcamentoComFormula() {
        Discotecagem discotecagem = new Discotecagem();
        discotecagem.setValorBase(100.0);
        discotecagem.setQuantidadeHoras(5.0);

        assertEquals(500.0, discotecagem.calcularOrcamento());
    }

    @Test
    void deveCalcularImpostoComFormula() {
        Discotecagem discotecagem = new Discotecagem();
        discotecagem.setValorBase(100.0);
        discotecagem.setQuantidadeHoras(5.0);

        assertEquals(125.0, discotecagem.calcularImposto());
    }
}