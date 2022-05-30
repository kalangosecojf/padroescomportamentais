package chainofresponsability;

public class Venda {

    private TipoVenda tipoVenda;

    public Venda(TipoVenda tipoVenda) {
        this.tipoVenda = tipoVenda;
    }
    
    public TipoVenda getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(TipoVenda tipoVenda) {
        this.tipoVenda = tipoVenda;
    }
    
}
