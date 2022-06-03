package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void devePedirMusica() {
        Cliente cliente = new Cliente();
        assertEquals("O Evento agradece seu pedido.\nA Producao respondeu seu pedido.\n" +
                        ">>A Producao agradece a mensagem: Asa Branca",
                cliente.pedirMusica("Asa Branca"));
    }

    @Test
    void deveReceberDoacao() {
        Cliente cliente = new Cliente();
        assertEquals("O Evento agradece seu contato.\nA Producao respondeu sua doação.\n" +
                ">>A Producao agradece a doação: Vou dor cem reais para o evento",
                cliente.receberDoacao("Vou dor cem reais para o evento"));
    }

    @Test
    void deveReclamarMusica() {
        Cliente cliente = new Cliente();
        assertEquals("O Evento agradece seu contato.\nA Producao respondeu sua reclamação.\n" +
                ">>A Producao vai tratar da reclamação: A música esta muito alta",
                cliente.reclamarMusica("A música esta muito alta"));
    }
}