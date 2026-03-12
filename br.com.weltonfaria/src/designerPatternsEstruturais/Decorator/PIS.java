package designerPatternsEstruturais.Decorator;

import java.math.BigDecimal;
import impostos.ImpostoDecoractor;
import orcamento.Orcamento;

public class PIS extends ImpostoDecoractor {
    
    public PIS(ImpostoDecoractor outro) {
        super(outro);
    }
    
    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.19"));    // 3% de PIS
    }
    
}






