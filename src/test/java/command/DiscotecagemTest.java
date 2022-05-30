package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscotecagemTest {

    Discotecagem discotecagem;
    Evento evento;

    @BeforeEach
    void setUp() {
        discotecagem = new Discotecagem();
        evento = new Evento ("2022-05-31", 1);
    }

    @Test
    void deveIniciarEvento() {
        Tarefa inicioEventoTarefa = new InicioEventoTarefa(evento);
        discotecagem.executarTarefa(inicioEventoTarefa);
        assertEquals("Evento Iniciado", evento.getSituacao());
    }

    @Test
    void deveTerminarEvento() {
        Tarefa terminoEventoTarefa = new TerminoEventoTarefa(evento);
        discotecagem.executarTarefa(terminoEventoTarefa);
        assertEquals("Evento Terminado", evento.getSituacao());
    }

    @Test
    void deveCancelarTerminoEvento() {
        Tarefa inicioEventoTarefa = new InicioEventoTarefa(evento);
        Tarefa terminoEventoTarefa = new TerminoEventoTarefa(evento);

        discotecagem.executarTarefa(inicioEventoTarefa);
        discotecagem.executarTarefa(terminoEventoTarefa);

        discotecagem.cancelarUltimaTarefa();

        assertEquals("Evento Iniciado", evento.getSituacao());
    }
}