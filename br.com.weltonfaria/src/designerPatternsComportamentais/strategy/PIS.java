package designerPatternsComportamentais.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import impostos.Imposto;
import orcamento.Orcamento;

public class PIS implements Imposto {
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.03")).setScale(2, RoundingMode.HALF_UP);    // 3% de PIS
    }
    
}






