package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventoTest {

    Evento evento;

    @BeforeEach
    public void setUp() {
        evento = new Evento();
    }

    // Evento Contratado

    @Test
    public void naoDeveContratarEventoStatusContratado() {
        evento.setStatus(EventoStatusContratado.getInstance());
        assertEquals("Contrato não realizado", evento.contratar());
    }

    @Test
    public void deveRealizarEventoStatusContratado() {
        evento.setStatus(EventoStatusContratado.getInstance());
        assertEquals("Evento realizado", evento.realizar());
    }

    @Test
    public void deveCancelarEventoStatusContratado() {
        evento.setStatus(EventoStatusContratado.getInstance());
        assertEquals("Cancelamento realizado", evento.cancelar());
    }

    @Test
    public void deveDivulgarEventoStatusContratado() {
        evento.setStatus(EventoStatusContratado.getInstance());
        assertEquals("Divulgacao realizada", evento.divulgar());
    }

    @Test
    public void deveOrcarEventoStatusContratado() {
        evento.setStatus(EventoStatusContratado.getInstance());
        assertEquals("Orcamento não realizado", evento.orcar());
    }


    // Evento Cancelado

    @Test
    public void naoDeveContratarEventoStatusCancelado() {
        evento.setStatus(EventoStatusCancelado.getInstance());
        assertEquals("Contrato não realizado", evento.contratar());
    }

    @Test
    public void deveRealizarEventoStatusCancelado() {
        evento.setStatus(EventoStatusCancelado.getInstance());
        assertEquals("Evento não realizado", evento.realizar());
    }

    @Test
    public void deveCancelarEventoStatusCancelado() {
        evento.setStatus(EventoStatusCancelado.getInstance());
        assertEquals("Cancelamento não realizado", evento.cancelar());
    }

    @Test
    public void deveDivulgarEventoStatusCancelado() {
        evento.setStatus(EventoStatusCancelado.getInstance());
        assertEquals("Divulgacao não realizada", evento.divulgar());
    }

    @Test
    public void deveOrcarEventoStatusCancelado() {
        evento.setStatus(EventoStatusCancelado.getInstance());
        assertEquals("Orcamento realizado", evento.orcar());
    }

    // Evento Orcamento

    @Test
    public void naoDeveContratarEventoStatusOrcado() {
        evento.setStatus(EventoStatusOrcado.getInstance());
        assertEquals("Contrato realizado", evento.contratar());
    }

    @Test
    public void deveRealizarEventoStatusOrcado() {
        evento.setStatus(EventoStatusOrcado.getInstance());
        assertEquals("Evento não realizado", evento.realizar());
    }

    @Test
    public void deveCancelarEventoStatusOrcado() {
        evento.setStatus(EventoStatusOrcado.getInstance());
        assertEquals("Cancelamento realizado", evento.cancelar());
    }

    @Test
    public void deveDivulgarEventoStatusOrcado() {
        evento.setStatus(EventoStatusOrcado.getInstance());
        assertEquals("Divulgacao não realizada", evento.divulgar());
    }

    @Test
    public void deveOrcarEventoStatusOrcado() {
        evento.setStatus(EventoStatusOrcado.getInstance());
        assertEquals("Orcamento não realizado", evento.orcar());
    }

    // Evento Divulgado

    @Test
    public void naoDeveContratarEventoStatusDivulgado() {
        evento.setStatus(EventoStatusDivulgado.getInstance());
        assertEquals("Contrato não realizado", evento.contratar());
    }

    @Test
    public void deveRealizarEventoStatusDivulgado() {
        evento.setStatus(EventoStatusDivulgado.getInstance());
        assertEquals("Evento realizado", evento.realizar());
    }

    @Test
    public void deveCancelarEventoStatusDivulgado() {
        evento.setStatus(EventoStatusDivulgado.getInstance());
        assertEquals("Cancelamento realizado", evento.cancelar());
    }

    @Test
    public void deveDivulgarEventoStatusDivulgado() {
        evento.setStatus(EventoStatusDivulgado.getInstance());
        assertEquals("Divulgacao não realizada", evento.divulgar());
    }

    @Test
    public void deveOrcarEventoStatusDivulgado() {
        evento.setStatus(EventoStatusDivulgado.getInstance());
        assertEquals("Orcamento não realizado", evento.orcar());
    }

   // Evento Realizado

    @Test
    public void naoDeveContratarEventoStatusRealizado() {
        evento.setStatus(EventoStatusRealizado.getInstance());
        assertEquals("Contrato não realizado", evento.contratar());
    }

    @Test
    public void deveRealizarEventoStatusRealizado() {
        evento.setStatus(EventoStatusRealizado.getInstance());
        assertEquals("Evento não realizado", evento.realizar());
    }

    @Test
    public void deveCancelarEventoStatusRealizado() {
        evento.setStatus(EventoStatusRealizado.getInstance());
        assertEquals("Cancelamento realizado", evento.cancelar());
    }

    @Test
    public void deveDivulgarEventoStatusRealizado() {
        evento.setStatus(EventoStatusRealizado.getInstance());
        assertEquals("Divulgacao não realizada", evento.divulgar());
    }

    @Test
    public void deveOrcarEventoStatusRealizado() {
        evento.setStatus(EventoStatusDivulgado.getInstance());
        assertEquals("Orcamento não realizado", evento.orcar());
    }


}