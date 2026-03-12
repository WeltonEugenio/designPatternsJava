package designerPatternsEstruturais.Composite.situacao;

import java.math.BigDecimal;

import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;

public class EmAnalise extends SituacaoOrcamentoComposite {

    public BigDecimal calcularDescontoExtra(OrcamentoComposite orcamentoComposite) {
        return orcamentoComposite.getValor().multiply(new BigDecimal("0.05"));
    }
    
    public void aprovar(OrcamentoComposite orcamentoComposite) {
       orcamentoComposite.setSituacao(new Aprovado());
    }   

    public void reprovar(OrcamentoComposite orcamentoComposite) {
       orcamentoComposite.setSituacao(new Reprovado());
    }   
    
}






