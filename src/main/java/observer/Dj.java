package observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Dj implements Observer {

    private String nome;
    private String ultimaMusica;

    public Dj(String nome) {
        this.nome = nome;
    }


    public String getUltimaMusica() {
        return this.ultimaMusica;
    }

    public void cadastrar(Banda banda) {
        banda.addObserver(this);
    }

    public void update(Observable banda, Object arg1) {
        this.ultimaMusica = this.nome + ", nova musica da " + banda.toString();
    }

}
