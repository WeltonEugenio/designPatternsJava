package designerPatternsComportamentais.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import impostos.Imposto;
import orcamento.Orcamento;

public class ICMS implements Imposto {
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.HALF_UP);    // 10% de ICMS
    }
    
}






