package designerPatternsEstruturais.Proxy;

import java.math.BigDecimal;

import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;

public class OrcamentoProxy  extends OrcamentoComposite{

    private BigDecimal valor;
    private  OrcamentoComposite orcamento;
    
    public OrcamentoProxy(OrcamentoComposite orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }
        
}
