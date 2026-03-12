package designerPatternsEstruturais.Composite.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import designerPatternsEstruturais.Composite.situacao.EmAnalise;
import designerPatternsEstruturais.Composite.situacao.Finalizado;
import designerPatternsEstruturais.Composite.situacao.SituacaoOrcamentoComposite;

public class OrcamentoComposite implements Orcavel{
    private BigDecimal valor;
    private SituacaoOrcamentoComposite situacao;
    List<Orcavel> itens;
  
    public OrcamentoComposite (){
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
      
    }

    public SituacaoOrcamentoComposite getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamentoComposite situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public BigDecimal getValor() {
        return valor;
    }
    
    public void aplicarDescontoExtra(){
        BigDecimal ValorDoDescontoExtra = this.situacao.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(ValorDoDescontoExtra);

    }


    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }   
    
    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);

    }

    //Criado para simular lentido no retorno e como utilizar o padrão proxy
   public BigDecimal getValorProxy() {
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
       
    }
        return valor;
    }
}






