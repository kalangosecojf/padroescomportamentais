package chainofresponsability;

public class DepartamentoComercial extends Departamento {

    public DepartamentoComercial(Departamento superior) {
        listaVendas.add(TipoVendaOrcamento.getTipoVendaOrcamento());
        setDepartamentoSuperior(superior);
    }
    
    public String getDescricaoDepartamento() {
        return "Comercial";
    }

}
