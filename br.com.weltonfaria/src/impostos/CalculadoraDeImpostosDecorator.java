package impostos;

import java.math.BigDecimal;

import orcamento.Orcamento;


public class CalculadoraDeImpostosDecorator {

    public BigDecimal calcular(Orcamento orcamento, ImpostoDecoractor imposto) {
        return imposto.calcular(orcamento);
    }   
    
}






