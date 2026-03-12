package desconto;

import java.math.BigDecimal;

import designerPatternsComportamentais.chainOfResposibility.DescontoOrcamentoComValorMaior500;
import designerPatternsComportamentais.chainOfResposibility.DescontoOrcamentoMais5Item;
import designerPatternsComportamentais.chainOfResposibility.SemDesconto;
import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;
import orcamento.Orcamento;


public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        
        Descontos cadeiaDeDescontos = new  DescontoOrcamentoMais5Item(
            new DescontoOrcamentoComValorMaior500( 
                new SemDesconto()));

         return cadeiaDeDescontos.calcular(orcamento);

    }

        public BigDecimal calcular(OrcamentoComposite orcamento){
        
        Descontos cadeiaDeDescontos = new  DescontoOrcamentoMais5Item(
            new DescontoOrcamentoComValorMaior500( 
                new SemDesconto()));

         return cadeiaDeDescontos.calcular(orcamento);

    }
    
}

