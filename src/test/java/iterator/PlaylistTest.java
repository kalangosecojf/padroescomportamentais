package iterator;

import iterator.Album;
import iterator.Musica;
import iterator.Playlist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    @Test
    void deveContarMusicasExecutadasAlbum() {
        Album album = new Album(
                new Musica("Danado de Bom", false),
                new Musica("Asa Branca", true),
                new Musica("Xote das Meninas", false),
                new Musica("Vida de Viajante", true)
        );
        assertEquals(2, Playlist.contarMusicasExecutadasAlbum(album));
    }

    @Test
    void deveContarTotalMusicasAlbum() {
        Album album = new Album(
                new Musica("Danado de Bom", false),
                new Musica("Asa Branca", true),
                new Musica("Xote das Meninas", false),
                new Musica("Vida de Viajante", true)
        );
        assertEquals(4, Playlist.contarTotalMusicaAlbum(album));
    }

}