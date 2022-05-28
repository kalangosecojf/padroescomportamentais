package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscoOuroTest {

    @Test
    void deveRetonarDiscoOuroAprovado() {
        DiscoOuro disco = new DiscoOuro();
        disco.setVendas1Semestre(120.0f);
        disco.setVendas2Semestre(90.0f);
        assertEquals("Aprovado", disco.verificarClassificacao());
    }

    @Test
    void deveRetonarDiscoOuroReprovado() {
        DiscoOuro disco = new DiscoOuro();
        disco.setVendas1Semestre(110.0f);
        disco.setVendas2Semestre(90.0f);
        assertEquals("Reprovado", disco.verificarClassificacao());
    }

    @Test
    void deveRetornarInformacoesDiscoOuro() {
        DiscoOuro disco = new DiscoOuro();
        disco.setVendas1Semestre(110.0f);
        disco.setVendas2Semestre(90.0f);
        disco.setNomeDisco("Danado de Bom");
        disco.setMatriculaDisco(5);
        assertEquals("DiscoOuro{matriculaDisco=5, nomeDisco='Danado de Bom', classificacao=Reprovado}", disco.getInfo());
    }

}