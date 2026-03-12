package designerPatternsComportamentais.chainOfResposibility;

import java.math.BigDecimal;

import desconto.Descontos;
import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;
import orcamento.Orcamento;

public class SemDesconto extends Descontos {
    
    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calcular(OrcamentoComposite orcamento) {
        return BigDecimal.ZERO;
    }


}






