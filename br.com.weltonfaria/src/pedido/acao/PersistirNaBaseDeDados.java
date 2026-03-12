package pedido.acao;

import pedido.Pedido;

public class PersistirNaBaseDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println(">>> PERSISTIR PEDIDO NA BASE DE DADOS <<< ");
    }
}






