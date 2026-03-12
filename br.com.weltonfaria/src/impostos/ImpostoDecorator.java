package impostos;

import java.math.BigDecimal;

import orcamento.Orcamento;

public abstract class ImpostoDecorator implements Imposto {
    private ImpostoDecorator outroImposto;
    
    public ImpostoDecorator(ImpostoDecorator outro){
        this.outroImposto = outro;
    } 

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        
        if(outroImposto != null){
            valorOutroImposto = outroImposto.realizarCalculo(orcamento);
        }
        
        return valorImposto.add(valorOutroImposto);

   
    }
    
} 

