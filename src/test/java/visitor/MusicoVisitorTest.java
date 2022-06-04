package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MusicoVisitorTest {

    @Test
    void deveExibirDj() {
        Dj dj = new Dj(1, "Kalango", new Evento("Arraiá do Cultural"));

        MusicoVisitor visitor = new MusicoVisitor();
        assertEquals("DJ{codigo=1, nome='Kalango', evento=Arraiá do Cultural}", visitor.exibir(dj));
    }

    @Test
    void deveExibirProfessor() {
        Zabumbeiro zabumbeiro = new Zabumbeiro(10, "Mauricio", "Zabumba aro 16");

        MusicoVisitor visitor = new MusicoVisitor();
        assertEquals("Zabumbeiro{codigo=10, nome='Mauricio', instrumento='Zabumba aro 16'}", visitor.exibir(zabumbeiro));
    }

    @Test
    void deveExibirFuncionario() {
        Sanfoneiro sanfoneiro = new Sanfoneiro(7, "Dominguinhos", 15000.0f);

        MusicoVisitor visitor = new MusicoVisitor();
        assertEquals("Sanfoneiro{codigo=7, nome='Dominguinhos', salario=15000.0}", visitor.exibir(sanfoneiro));
    }

}