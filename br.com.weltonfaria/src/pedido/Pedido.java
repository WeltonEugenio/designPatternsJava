package pedido;

import java.time.LocalDateTime;

import orcamento.Orcamento;

public class Pedido {
    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;
    
    public Pedido(Orcamento orcamento, String cliente, LocalDateTime data) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }
    
    public LocalDateTime getData() {
        return data;
    }
    
    public Orcamento getOrcamento() {
        return orcamento;
    }
    
}






