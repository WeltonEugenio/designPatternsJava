package pedido;

import java.time.LocalDateTime;

import orcamento.Orcamento;

public class GeraPedidoHandler {
    
    //construtor cm injecao de dependencia: repository, service, etc

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(orcamento, dados.getCliente(), LocalDateTime.now());
        
        System.out.println(pedido.getCliente());
        System.out.println("SALVAR PEDIDO BD");
        System.out.println("ENVIAR EMAIL");


    }   
}






