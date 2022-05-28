package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicaTest {

    @Test
    void deveNotificarUmDj() {
        Banda banda = new Banda( "Trio Nordestino", "Expresso 222",2019);
        Dj dj = new Dj("DJ Kalango");
        dj.cadastrar(banda);
        banda.lancarMusicaNova();
        assertEquals("DJ Kalango, nova musica da Banda{ nomeBanda='Trio Nordestino', nomeMusica='Expresso 222', anoLancamento=2019'}",
                dj.getUltimaMusica());
    }

    @Test
    void deveNotificarVariosDJs() {
        Banda banda = new Banda( "Trio Nordestino", "Expresso 222",2019);
        Dj dj1 = new Dj("DJ Kalango");
        Dj dj2 = new Dj("DJ Danilo");
        dj1.cadastrar(banda);
        dj2.cadastrar(banda);
        banda.lancarMusicaNova();
        assertEquals("DJ Kalango, nova musica da Banda{ nomeBanda='Trio Nordestino', nomeMusica='Expresso 222', anoLancamento=2019'}",
                dj1.getUltimaMusica());
        assertEquals("DJ Danilo, nova musica da Banda{ nomeBanda='Trio Nordestino', nomeMusica='Expresso 222', anoLancamento=2019'}",
                dj2.getUltimaMusica());
    }


    @Test
    void naoDeveNotificarDJ() {
        Banda banda = new Banda( "Trio Nordestino", "Expresso 222",2019);
        Dj dj = new Dj("DJ Kalango");
        banda.lancarMusicaNova();
        assertEquals(null, dj.getUltimaMusica());
    }

    @Test
    void deveNotificarDJ2Banda1() {
        Banda banda1 = new Banda( "Trio Nordestino", "Expresso 222",2019);
        Banda banda2 = new Banda( "Falamansa", "Amigo Velho",2018);
        Dj dj1 = new Dj("DJ Kalango");
        Dj dj2 = new Dj("DJ Danilo");

        dj1.cadastrar(banda1);
        dj2.cadastrar(banda2);

        banda2.lancarMusicaNova();
        assertEquals(null,dj1.getUltimaMusica());
        assertEquals("DJ Danilo, nova musica da Banda{ nomeBanda='Falamansa', nomeMusica='Amigo Velho', anoLancamento=2018'}",
                dj2.getUltimaMusica());

    }
}
