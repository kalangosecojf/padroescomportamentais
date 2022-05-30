package chainofresponsability;

public class DepartamentoFinanceiro extends Departamento {

    public DepartamentoFinanceiro(Departamento superior) {
        listaVendas.add(TipoVendaContrato.getTipoVendaContrato());
        setDepartamentoSuperior(superior);
    }
    
    public String getDescricaoDepartamento() {
        return "Financeiro";
    }

}
