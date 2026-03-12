package designerPatternsComportamentais.templateMethod;

import java.math.BigDecimal;

import desconto.DescontosTemplateMethod;
import orcamento.Orcamento;

public class DescontoOrcamentoMais5Item  extends DescontosTemplateMethod{
    
    public DescontoOrcamentoMais5Item(DescontosTemplateMethod proximo) {
        super(proximo);
    }
    
        public BigDecimal efetuarCalculo(Orcamento orcamento) {       
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
   
        }
        
        @Override
        public boolean deveAplicar(Orcamento orcamento) {
            return orcamento.getQuantidadeItens() > 5;
        }
}






