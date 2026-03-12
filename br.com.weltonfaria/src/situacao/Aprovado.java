package situacao;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }
    
 
    public void finalizado(Orcamento orcamento) {
       orcamento.setSituacao(new Finalizado());
    }
    
}






