package situacao;

import orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizado(Orcamento orcamento) {
       orcamento.setSituacao(new Finalizado());
    }
    
}






