package observer;

import java.util.Observable;
import java.util.Observer;

public class Banda extends Observable {
    private String nomeBanda;

    private String nomeMusica;

    private Integer anoLancamento;

    public Banda(String nomeBanda, String nomeMusica,Integer anoLancamento) {
        this.nomeBanda = nomeBanda;
        this.nomeMusica = nomeMusica;
        this.anoLancamento = anoLancamento;
    }

    public void lancarMusicaNova() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Banda{" +
                " nomeBanda='" + nomeBanda + '\'' +
                ", nomeMusica='" + nomeMusica + '\'' +
                ", anoLancamento=" + anoLancamento +  '\'' +
                '}';
    }

}
