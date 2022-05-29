package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DespesaTest {

    @Test
    void deveCalcularDespesaBruta() {
        Evento evento = new Evento();
        evento.calcularDespesaBruta(1200.0f, 300.0f);
        assertEquals(1500.0f, evento.getValor());
    }

    @Test
    void deveCalcularDespesaEcad() {
        Evento evento = new Evento();
        evento.calcularDespesaEcad(1200.0f, 5.0f);
        assertEquals(6000.0f, evento.getValor());
    }

    @Test
    void deveCalcularDespesaIcms() {
        Evento evento = new Evento();
        evento.calcularDespesaIcms(120f, 5f);
        assertEquals(2400.0f, evento.getValor());
    }

    @Test
    void deveCalcularDespesaIss() {
        Evento evento = new Evento();
        evento.calcularDespesaIss(120f, 5f);
        assertEquals(12000.0f, evento.getValor());
    }


    @Test
    void naoDeveCalcularDespesaIcmsPorZero() {
        try {
            Evento evento = new Evento();
            evento.calcularDespesaIcms(0f, 100.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }
    @Test
    void naoDeveCalcularDespesaIssPorZero() {
        try {
            Evento evento = new Evento();
            evento.calcularDespesaIss(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }


}