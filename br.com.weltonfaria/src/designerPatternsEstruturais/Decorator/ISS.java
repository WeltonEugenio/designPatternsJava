package designerPatternsEstruturais.Decorator;

import java.math.BigDecimal;
import impostos.ImpostoDecoractor;
import orcamento.Orcamento;

public class ISS extends ImpostoDecoractor {

    public ISS(ImpostoDecoractor outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.15"));
    }
    
}






