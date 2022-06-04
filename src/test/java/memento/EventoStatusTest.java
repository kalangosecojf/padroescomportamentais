package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventoStatusTest {

    @Test
    void deveArmazenarStatus() {
        Evento evento = new Evento();
        evento.setStatus(EventoStatusContratado.getInstance());
        evento.setStatus(EventoStatusRealizado.getInstance());
        assertEquals(2,evento.getListaStatus().size());
    }

    @Test
    void deveRetornarStatusInicial() {
        Evento evento = new Evento();
        evento.setStatus(EventoStatusContratado.getInstance());
        evento.setStatus(EventoStatusRealizado.getInstance());
        evento.restauraStatus(0);
        assertEquals(EventoStatusContratado.getInstance(), evento.getStatus());
    }

    @Test
    void deveRetornarStatusAnterior() {
        Evento evento = new Evento();
        evento.setStatus(EventoStatusContratado.getInstance());
        evento.setStatus(EventoStatusCancelado.getInstance());
        evento.setStatus(EventoStatusContratado.getInstance());
        evento.setStatus(EventoStatusRealizado.getInstance());
        evento.restauraStatus(2);
        assertEquals(EventoStatusContratado.getInstance(), evento.getStatus());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Evento evento = new Evento();
            evento.restauraStatus(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}