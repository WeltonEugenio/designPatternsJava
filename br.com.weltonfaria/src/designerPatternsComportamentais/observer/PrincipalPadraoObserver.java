package designerPatternsComportamentais.observer;

import java.math.BigDecimal;
import java.util.Arrays;

import pedido.GeraPedido;
import pedido.GeraPedidoHandlerObserver;
import pedido.acao.AcaoAposGerarPedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.PersistirNaBaseDeDados;

public class PrincipalPadraoObserver {
    public static void main(String[] args) throws Exception {

        System.out.println("--- Design Patterns - Comportamentais - Observer --- \n");
        String texto = """
            O padrão de projeto Observer (Observador) é um padrão comportamental utilizado para estabelecer uma relação de dependência 
            "um-para-muitos" entre objetos. Ele garante que quando um objeto principal (Observável) altera seu estado, 
            todos os seus dependentes (chamados de Observadores) sejam notificados e atualizados automaticamente.
            Conceitos Principais
                * Subject (Observável): O objeto que possui o estado e gerencia uma lista de observadores. Ele notifica os observadores quando há mudanças.
                * Observer (Observador): A interface ou classe que define o método de atualização para ser notificado pelo Subject.
                * Desacoplamento: O Subject não precisa conhecer os detalhes concretos dos Observers, apenas que eles 
                implementam uma interface específica..""";   
        System.out.println(texto + "\n"); 

        String cliente = "João Silva";
        BigDecimal valorOrcamento = new BigDecimal("1500.00");
        int quantidadeItens = 3;
        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);  
        GeraPedidoHandlerObserver handler = new GeraPedidoHandlerObserver(
            Arrays.<AcaoAposGerarPedido>asList(
                new EnviarEmailPedido(),
                new PersistirNaBaseDeDados()
            ));
                
        handler.executa(gerador);

    
    }



}






