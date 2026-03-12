package designerPatternsEstruturais.Composite.situacao;

import java.math.BigDecimal;

import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;
import exception.DomainException;

public abstract class SituacaoOrcamentoComposite {

   public BigDecimal calcularDescontoExtra(OrcamentoComposite orcamento) {
      return BigDecimal.ZERO;
   }

   public void aprovar(OrcamentoComposite orcamento) {
      throw new DomainException("Orçamento não pode ser aprovado");
   }

   public void reprovar(OrcamentoComposite orcamento) {
      throw new DomainException("Orçamento não pode ser reprovado");
   }

   public void finalizar(OrcamentoComposite orcamento) {
      throw new DomainException("Orçamento não pode ser finalizado");
   }

}
