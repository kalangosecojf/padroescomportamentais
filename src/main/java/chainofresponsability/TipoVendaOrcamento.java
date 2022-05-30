package chainofresponsability;

public class TipoVendaOrcamento implements TipoVenda {

    private static TipoVendaOrcamento tipoVendaOrcamento = new TipoVendaOrcamento();

    private TipoVendaOrcamento() {};

    public static TipoVendaOrcamento getTipoVendaOrcamento() {
        return tipoVendaOrcamento;
    }
}
