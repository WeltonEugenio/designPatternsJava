package designerPatternsComportamentais.chainOfResposibility;

import java.math.BigDecimal;

import desconto.CalculadoraDeDesconto;
import orcamento.Orcamento;

public class PrincipalPadraoChainOfResposibility {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Comportamentais - Chain Of Responsibility --- \n");
        String texto = """
            O Chain of Responsibility é um padrão de projeto comportamental que permite passar solicitações ao longo de uma 
            corrente de manipuladores (handlers). Ao receber um pedido, cada manipulador decide processá-lo ou passá-lo 
            para o próximo na cadeia. Isso desacopla o remetente da solicitação dos seus destinatários, aumentando a flexibilidade. 
            
            Principais Características e Benefícios:
                * Desacoplamento: O cliente não precisa saber qual objeto concreto processará a requisição.
                * Encadeamento Dinâmico: Handleres podem ser adicionados, removidos ou reordenados em tempo de execução.
                * Flexibilidade: Alternativa a longas estruturas if-else ou switch.
                * Responsabilidade Única: Cada handler concentra-se em um único tipo de tratamento.""";   
        System.out.println(texto + "\n"); 
          
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));

    }
}






