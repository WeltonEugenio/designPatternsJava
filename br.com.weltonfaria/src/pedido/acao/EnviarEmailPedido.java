package pedido.acao;

import pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println(">>> ENVIAR EMAIL COM DADOS DO PEDIDO <<< ");
    }
}







