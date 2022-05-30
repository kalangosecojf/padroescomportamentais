package chainofresponsability;

public class TipoVendaProspecto implements TipoVenda {

    private static TipoVendaProspecto tipoVendaProspecto = new TipoVendaProspecto();

    private TipoVendaProspecto() {};
    
    public static TipoVendaProspecto getTipoVendaProspecto() {
        return tipoVendaProspecto;
    }
}
