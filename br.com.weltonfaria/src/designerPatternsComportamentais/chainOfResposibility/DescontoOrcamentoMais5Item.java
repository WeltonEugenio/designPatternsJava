package designerPatternsComportamentais.chainOfResposibility;

import java.math.BigDecimal;

import desconto.Descontos;
import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;
import orcamento.Orcamento;

public class DescontoOrcamentoMais5Item  extends Descontos{
    
    public DescontoOrcamentoMais5Item(Descontos proximo) {
        super(proximo);
    }
    
    public BigDecimal calcular(Orcamento orcamento) {       

        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }

    @Override
    public BigDecimal calcular(OrcamentoComposite orcamento) {
        if(orcamento.getQuantidadeItens() > 5){
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
        
    }

}






