package desconto;

import java.math.BigDecimal;

import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;
import orcamento.Orcamento;

public abstract class Descontos {
    protected Descontos proximo;

    public Descontos(Descontos proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento); 
     public abstract BigDecimal calcular(OrcamentoComposite orcamento);   
}






