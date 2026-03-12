package orcamento;

import java.math.BigDecimal;

import situacao.EmAnalise;
import situacao.Finalizado;
import situacao.SituacaoOrcamento;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;


    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public Orcamento (BigDecimal valor, int quantidadeItens){
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
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
    
    public boolean isfinalizado() {
        return this.situacao instanceof Finalizado;
    }

}






