package designerPatternsEstruturais.Composite.orcamento;

import java.math.BigDecimal;

public class ItemOrcamentoComposite implements Orcavel {

    private BigDecimal valor;

    public ItemOrcamentoComposite(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
    
}
