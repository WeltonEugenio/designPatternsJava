package designerPatternsEstruturais.Decorator;

import java.math.BigDecimal;
import impostos.ImpostoDecoractor;
import orcamento.Orcamento;

public class ICMS extends ImpostoDecoractor {
    
    public ICMS(ImpostoDecoractor outro) {
        super(outro);
    }

    public BigDecimal realizarCalculo (Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.10"));    // 10% de ICMS
    }
    
}






