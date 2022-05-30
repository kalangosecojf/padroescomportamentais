package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    DepartamentoFinanceiro financeiro;
    DepartamentoComercial comercial;
    DepartamentoVenda venda;

    @BeforeEach
    void setUp() {
        financeiro = new DepartamentoFinanceiro(null);
        comercial = new DepartamentoComercial(financeiro);
        venda = new DepartamentoVenda(comercial);
    }

    @Test
    void deveRetornarDepartamentoVendaVenderShow() {
        assertEquals("Venda", venda.venderShow(new Venda(TipoVendaProspecto.getTipoVendaProspecto())));
    }

    @Test
    void deveRetornarDepartamentoComercialVenderShow() {
        assertEquals("Comercial", venda.venderShow(new Venda(TipoVendaOrcamento.getTipoVendaOrcamento())));
    }

    @Test
    void deveRetornarDepartamentoFinanceiroVenderShow() {
        assertEquals("Financeiro", venda.venderShow(new Venda(TipoVendaContrato.getTipoVendaContrato())));
    }
}