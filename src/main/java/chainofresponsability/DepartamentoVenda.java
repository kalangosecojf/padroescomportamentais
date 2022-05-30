package chainofresponsability;

public class DepartamentoVenda extends Departamento {
    
    public DepartamentoVenda(Departamento superior) {
        listaVendas.add(TipoVendaProspecto.getTipoVendaProspecto());
        setDepartamentoSuperior(superior);
    }
    
    public String getDescricaoDepartamento() {
        return "Venda";
    }
}
