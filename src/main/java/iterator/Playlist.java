package iterator;

import java.util.Iterator;

public class Playlist {

    public static Integer contarMusicasExecutadasAlbum(Album album) {
        int quantidade = 0;
        for (Musica musica : album) {
            if (musica.isExecutada()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMusicaAlbum(Album album) {
        int quantidade = 0;
        for (Iterator a = album.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
