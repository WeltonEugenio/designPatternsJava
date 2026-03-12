package designerPatternsEstruturais.Composite.situacao;

import java.math.BigDecimal;

import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;

public class Aprovado extends SituacaoOrcamentoComposite {

    public BigDecimal calcularDescontoExtra(OrcamentoComposite orcamentoComposite) {
        return orcamentoComposite.getValor().multiply(new BigDecimal("0.02"));
    }
    
 
    public void finalizado(OrcamentoComposite orcamentoComposite) {
       orcamentoComposite.setSituacao(new Finalizado());
    }
    
}






