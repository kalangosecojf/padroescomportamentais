package chainofresponsability;

import java.util.ArrayList;

public abstract class Departamento {

    protected ArrayList listaVendas = new ArrayList();
    private Departamento departamentoSuperior;

    public Departamento getDepartamentoSuperior() {
        return departamentoSuperior;
    }

    public void setDepartamentoSuperior(Departamento departamentoSuperior) {
        this.departamentoSuperior = departamentoSuperior;
    }
    
    public abstract String getDescricaoDepartamento();
    
    public String venderShow(Venda venda) {
        if (listaVendas.contains(venda.getTipoVenda())) {
            return getDescricaoDepartamento();
        }
        else {
            if (departamentoSuperior != null) {
                return departamentoSuperior.venderShow(venda);
            }
            else 
            {
                return "Sem permissao";
            }
        }        
    }
}
