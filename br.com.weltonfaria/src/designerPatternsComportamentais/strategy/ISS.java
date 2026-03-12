package designerPatternsComportamentais.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import impostos.Imposto;
import orcamento.Orcamento;

public class ISS implements Imposto {
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06")).setScale(2, RoundingMode.HALF_UP);    // 6% de ISS
    }
    
}






