package designerPatternsEstruturais.Composite.situacao;

import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;

public class Reprovado extends SituacaoOrcamentoComposite {

    public void finalizado(OrcamentoComposite orcamentoComposite) {
       orcamentoComposite.setSituacao(new Finalizado());
    }
    
}






