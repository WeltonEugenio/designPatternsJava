package pedido;

import java.time.LocalDateTime;
import java.util.List;

import pedido.acao.AcaoAposGerarPedido;
import orcamento.Orcamento;

public class GeraPedidoHandlerObserver {
    private List<AcaoAposGerarPedido> acoes;

        public GeraPedidoHandlerObserver(List<AcaoAposGerarPedido> acoes) {
            this.acoes = acoes;
        }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(orcamento, dados.getCliente(), LocalDateTime.now());
        
        acoes.forEach(a -> a.executarAcao(pedido));
    }
}





