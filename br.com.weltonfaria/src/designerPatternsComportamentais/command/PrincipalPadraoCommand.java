package designerPatternsComportamentais.command;

import java.math.BigDecimal;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;

public class PrincipalPadraoCommand {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Comportamentais - Command ---");
        String texto = """
            O padrão de projeto Command é um padrão comportamental que encapsula uma solicitação ou ação como um objeto completo.                
    ]
            Principais Características e Benefícios:
                * Desacoplamento: O objeto que invoca o comando (ex: um botão na interface) não precisa conhecer a lógica interna ou quem executará a ação (o receptor).
                * Encapsulamento de Ações: Todas as informações necessárias para executar uma ação (métodos, argumentos, receptor) são armazenadas dentro do objeto de comando.
                * Funcionalidades Extras: Facilita a implementação de filas de comandos, histórico de ações, operações "undo/redo" (desfazer/refazer) e logs.
                * Flexibilidade: Permite adicionar novos comandos sem alterar o código existente.""";   
        System.out.println(texto); 

        String cliente = "João Silva";
        BigDecimal valorOrcamento = new BigDecimal("1500.00");
        int quantidadeItens = 3;
        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);  
        GeraPedidoHandler  handler = new GeraPedidoHandler(/*injeção de dependência*/);
        handler.executa(gerador);


    }
}