package designerPatternsComportamentais.templateMethod;

import java.math.BigDecimal;

import desconto.DescontosTemplateMethod;
import orcamento.Orcamento;

public class SemDesconto extends DescontosTemplateMethod {
    
    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }


}






