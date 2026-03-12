package designerPatternsComportamentais.chainOfResposibility;

import java.math.BigDecimal;

import desconto.Descontos;
import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;
import orcamento.Orcamento;

public class DescontoOrcamentoComValorMaior500 extends Descontos {
    
    public DescontoOrcamentoComValorMaior500(Descontos proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO; 
    }

    @Override
    public BigDecimal calcular(OrcamentoComposite orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO; 
    }
}






