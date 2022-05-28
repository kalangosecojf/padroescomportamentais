package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscoPrataTest {

    @Test
    void deveRetonarDiscoPrataAprovado() {
        DiscoPrata disco = new DiscoPrata();
        disco.setVendas1Semestre(70.0f);
        disco.setVendas2Semestre(80.0f);
        assertEquals("Aprovado", disco.verificarClassificacao());
    }
    @Test
    void deveRetonarDiscoPrataReprovado() {
        DiscoPrata disco = new DiscoPrata();
        disco.setVendas1Semestre(70.0f);
        disco.setVendas2Semestre(70.0f);
        assertEquals("Reprovado", disco.verificarClassificacao());
    }


    @Test
    void deveRetornarInformacoes() {
        DiscoPrata disco = new DiscoPrata();
        disco.setVendas1Semestre(70.0f);
        disco.setVendas2Semestre(70.0f);
        disco.setNomeDisco("Danado de Bom");
        disco.setMatriculaDisco(5);
        assertEquals("DiscoPrata{matriculaDisco=5, nomeDisco='Danado de Bom', classificacao=Reprovado}", disco.getInfo());
    }

}