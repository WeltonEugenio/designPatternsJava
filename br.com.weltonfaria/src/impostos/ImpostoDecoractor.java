package impostos;

import java.math.BigDecimal;

import orcamento.Orcamento;

public abstract class ImpostoDecoractor implements Imposto {
    private ImpostoDecoractor outroImposto;
    
    public ImpostoDecoractor(ImpostoDecoractor outro){
        this.outroImposto = outro;
    } 

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        
        if(outroImposto != null){
            valorOutroImposto = outroImposto.calcular(orcamento);
        }
        valorImposto = valorImposto.add(valorOutroImposto);
        
        return valorImposto;
   
    }
    
} 

