package orcamento;

import java.util.Map;

import exception.DomainException;
import http.HttpAdapter;

public class RegistroDeOrcamento {
    
    private HttpAdapter httpAdapter;
    
    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }
    
    public void registrar(Orcamento orcamento) {
        if (!orcamento.isfinalizado()) {
            throw new DomainException("Orcamento não finalizado");
        }    

       String url = "http://api.externa.com/orcamentos";
       Map<String, Object> dados = Map.of(
            "valor", orcamento.getValor(),
            "quantidadeItens", orcamento.getQuantidadeItens(),
            "situacao", orcamento.getSituacao().getClass().getSimpleName()
        );
       httpAdapter.post(url, dados);
    }

}
