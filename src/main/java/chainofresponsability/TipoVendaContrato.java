package chainofresponsability;

public class TipoVendaContrato implements TipoVenda {

    private static TipoVendaContrato tipoVendaContrato = new TipoVendaContrato();

    private TipoVendaContrato() {};

    public static TipoVendaContrato getTipoVendaContrato() {
        return tipoVendaContrato;
    }
}
