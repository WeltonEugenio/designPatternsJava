package designerPatternsComportamentais.templateMethod;

import java.math.BigDecimal;
import desconto.DescontosTemplateMethod;
import orcamento.Orcamento;

public class DescontoOrcamentoComValorMaior500 extends DescontosTemplateMethod {
    
    public DescontoOrcamentoComValorMaior500(DescontosTemplateMethod proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
       return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}






